package com.example.demo.repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Stories;

public interface StoriesRepo extends JpaRepository<Stories,Long>{
	
	//public List<Stories> findbystoryName(String name);

}
