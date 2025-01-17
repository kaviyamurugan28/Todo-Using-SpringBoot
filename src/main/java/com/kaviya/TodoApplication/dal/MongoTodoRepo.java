package com.kaviya.TodoApplication.dal;

import com.kaviya.TodoApplication.model.todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MongoTodoRepo implements todorepo{
    @Autowired
    private Mongorepo mrepo;
    
    public List<todomodel> getAllTodos() {
        System.out.println("Get repo: ");
        return mrepo.findAll();
    }

    @Override
    public todomodel createTodo(todomodel todo_entry) {
        return mrepo.save(todo_entry);
    }

    @Override
    public todomodel updateTodo(todomodel todo_entry, String id) {
        todomodel oldEntry = mrepo.findById(id).get();
        oldEntry.setTitle(todo_entry.getTitle());
        oldEntry.setDescription(todo_entry.getDescription());
        return mrepo.save(oldEntry);
    }

    @Override
    public String deleteTodo(String id) {
        mrepo.deleteById(id);
        return "Deleted Successfully";
    }
}
