package com.kaviya.TodoApplication.controller;

import com.kaviya.TodoApplication.model.todomodel;
import com.kaviya.TodoApplication.services.Todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Todocontroller {

    @Autowired
    Todoservice tservice;

    @GetMapping("/todo")
    public List<todomodel> getTodocontroller(){
        return tservice.getTodoservice();
    }
    @PostMapping("/todo")
    public todomodel cresteTodocontroller(@RequestBody todomodel todo_entry){
        return tservice.createTodoservice(todo_entry);
    }
    @PutMapping("/todo/{id}")
    public todomodel updateTodocontroller(@PathVariable String id, @RequestBody todomodel todo_entry){
        return tservice.updateTodoservice(todo_entry ,id);
    }
    @PostMapping("/todo/{id}")
    public String deleteTodocontroller(@PathVariable String id){
        return tservice.deleteTodoservice(id);
    }
}
