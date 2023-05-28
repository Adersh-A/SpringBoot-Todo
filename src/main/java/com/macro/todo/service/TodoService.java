package com.macro.todo.service;

import com.macro.todo.domain.Todo;
import com.macro.todo.repository.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepo todoRepo;
    public TodoService(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public Todo addTask(Todo todo){
        return todoRepo.save(todo);
    }

    public Optional<Todo> findById(int id){
        return todoRepo.findById(id);
    }

    public List<Todo> findAllTasks(){
        return todoRepo.findAll();
    }

    public List<Todo> findInCompletedTasks(){
        return todoRepo.findByCompletedFalse();
    }
}
