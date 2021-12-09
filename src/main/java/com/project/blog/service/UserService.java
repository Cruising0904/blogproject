package com.project.blog.service;

import java.util.List;

import com.project.blog.dto.User;
import com.project.blog.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserService {

    @Autowired
    // private MongoTemplate mt;
    private UserRepository uRepo;

    public User insetUser(String id, String email, String grade) {
        User user = new User();
         user.setId(id);
        user.setEmail(email);
        user.setGrade(grade);
        // return uRepo.findById(id).orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND, "Not found event"));
        uRepo.findById("test");
        return uRepo.save(user);
        // mt.insert(user);

        
    }

}
