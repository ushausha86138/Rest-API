package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.service.Tutorial;

//import antlr.collections.List;
@Repository

public interface TutorialRepositry extends JpaRepository<Tutorial, Long>
{
	@Query(value="select value  from tutorial a where a.category_code= :category", nativeQuery=true)
    public Long getValueByCategory(String category);
    
}
