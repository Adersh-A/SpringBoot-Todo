package com.macro.todo.controller;

import com.macro.todo.domain.Todo;
import com.macro.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class TodoController {
    @Autowired
    TodoRepo todoRepo;
    @PostMapping("/add")
    public void addTask(@RequestBody Todo todo){
        System.out.println(todo.toString());
        todoRepo.save(todo);
    }
    @GetMapping("/getTasks")
    public List<Todo> getTasks(){
        return todoRepo.findAll();
    }
}
