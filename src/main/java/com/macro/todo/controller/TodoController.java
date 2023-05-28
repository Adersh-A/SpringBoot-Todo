package com.macro.todo.controller;

import com.macro.todo.domain.Todo;
import com.macro.todo.exception.TodoNotFoundException;
import com.macro.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Supplier;

@RestController()
public class TodoController {

    private final TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    @PostMapping("/add")
    public void addTask(@RequestBody Todo todo){
        System.out.println(todo.toString());
        todoService.addTask(todo);
    }
    @GetMapping("/")
    public List<Todo> getTasks(){
        return todoService.findAllTasks();
    }

    @GetMapping("/incomplete")
    public List<Todo> getIncompleteTasks(){
        return todoService.findInCompletedTasks();
    }
    @GetMapping("/todos/{id}")
    public Todo getTaskById(@PathVariable int id){
        return todoService.findById(id).orElseThrow(() -> new TodoNotFoundException("id: "+id));
    }
}
