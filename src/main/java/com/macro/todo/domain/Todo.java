package com.macro.todo.domain;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "TODO")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String task;
    private Date crt_date;
    private boolean completed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getCrt_date() {
        return crt_date;
    }

    public void setCrt_date(Date crt_date) {
        this.crt_date = crt_date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", crt_date=" + crt_date +
                ", status='" + completed + '\'' +
                '}';
    }


}
