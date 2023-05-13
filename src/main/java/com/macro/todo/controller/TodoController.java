package com.macro.todo.controller;

import com.macro.todo.domain.Todo;
import com.macro.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/getTasks")
    public List<Todo> getTasks(){
        return todoService.getAllTasks();
    }
}
