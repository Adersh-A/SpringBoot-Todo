package com.macro.todo.service;

import com.macro.todo.domain.Todo;
import com.macro.todo.repository.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepo todoRepo;
    public TodoService(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public Todo addTask(Todo todo){
        return todoRepo.save(todo);
    }

    public List<Todo> getAllTasks(){
        return todoRepo.findAll();
    }
}
