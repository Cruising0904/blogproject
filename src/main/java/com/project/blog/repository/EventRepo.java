package com.project.blog.repository;

import java.util.List;

import com.project.blog.dto.EventDoc;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepo extends MongoRepository<EventDoc, String> {
	
	List<EventDoc> findByTitle(String title);

}