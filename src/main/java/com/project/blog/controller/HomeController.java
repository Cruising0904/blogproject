package com.project.blog.controller;

import java.util.List;

import com.project.blog.dto.User;
import com.project.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @Autowired
    UserService uService;

    @GetMapping("/")
    public String root(){
        return "index";
    }
    @GetMapping("/test")
    public String test(){
        return "/sample/test";
    }
    @GetMapping("/k")
    public String tet(){
        return "/sample/keyzard";
    }
    @PostMapping("/test")
    public String testInpu(@RequestParam String id, @RequestParam String email, @RequestParam String grade, Model model) {
        System.out.println("포트");
        System.out.println(id);
         uService.insetUser(id, email, grade);
        return "redirect:/test";


    }
    
}
