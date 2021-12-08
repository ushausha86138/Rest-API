package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Tuservice;
import com.example.demo.service.Tutorial;

@RestController
public class CourseController {
	@Autowired
	public Tuservice sobj;
	
	@GetMapping("/FetchNumber/{category_id}")
	  public Long getTutorialById(@PathVariable("category_id") String category_id) {
	    Long tutorialData = sobj.getValueByCategory(category_id);	
	    if (tutorialData==null) {
	    	return 0L;
	    } else {
	    	return tutorialData;
	    }
	  }
}
