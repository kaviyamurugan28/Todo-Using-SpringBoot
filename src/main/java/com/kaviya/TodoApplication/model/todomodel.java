package com.kaviya.TodoApplication.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection ="todos")
@Data
@AllArgsConstructor
public class todomodel {
    private String id;
    private String title;
    private String description;

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

