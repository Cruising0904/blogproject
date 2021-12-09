package com.project.blog.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="users")
public class User{
    
    @Id
    private String id;
    private String email;
    private String grade;

}
