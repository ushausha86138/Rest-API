package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositry.TutorialRepositry;

@Service
public class Tuservice {
	@Autowired
	public TutorialRepositry robj;
	public Long getValueByCategory(String category) {
        // TODO Auto-generated method stub
       return robj.getValueByCategory(category);
    }
}
//Optional<Tutorial> getValueByCategory(String category);
