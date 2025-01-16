package com.kaviya.TodoApplication.dal;

import com.kaviya.TodoApplication.model.todomodel;

import java.util.List;


public interface todorepo {
     List<todomodel> getAllTodos();
     todomodel createTodo (todomodel todo_entry);
     todomodel updateTodo (todomodel todo_entry, String id);
     String deleteTodo (String id);
}
