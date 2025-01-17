package com.kaviya.TodoApplication.dal;

import com.kaviya.TodoApplication.model.todomodel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface Mongorepo extends MongoRepository <todomodel, String>{

}
