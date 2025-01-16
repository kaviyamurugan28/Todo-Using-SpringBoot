package com.kaviya.TodoApplication.services;

import com.kaviya.TodoApplication.dal.todorepo;
import com.kaviya.TodoApplication.model.todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Todoservice {
        @Autowired
        todorepo repo;

        public List<todomodel> getTodoservice() {
            System.out.println("Get all todo service");
            return repo.getAllTodos();
        }
        public todomodel createTodoservice(todomodel todo_entry) {
            return repo.createTodo(todo_entry);
        }

        public todomodel updateTodoservice(todomodel todo_entry, String id) {
            return repo.updateTodo(todo_entry, id);
        }

        public String deleteTodoservice(String id) {
            return repo.deleteTodo(id);
        }

    }
