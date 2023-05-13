package com.macro.todo.repository;

import com.macro.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Integer> {
    public List<Todo> findByCompletedFalse();
}
