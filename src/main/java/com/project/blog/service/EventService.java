package com.project.blog.service;

import java.util.List;

import com.project.blog.dto.EventDoc;
import com.project.blog.repository.EventRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	@Autowired
	private EventRepo eventRepo;
	
	

}