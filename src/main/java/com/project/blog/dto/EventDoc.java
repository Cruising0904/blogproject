package com.project.blog.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("event")
@Getter
@Setter
public class EventDoc {

	@Id
	private String _id;
	
	private String title;
	
	private String image;
	
}