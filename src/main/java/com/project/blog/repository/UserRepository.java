package com.project.blog.repository;

import java.util.List;
import java.util.Optional;

import com.project.blog.dto.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
  
}
