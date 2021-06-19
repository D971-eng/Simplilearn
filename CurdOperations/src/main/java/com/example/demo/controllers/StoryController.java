package com.example.demo.controllers;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.models.Stories;
import com.example.demo.repo.StoriesRepo;

@RestController
public class StoryController {

	@Autowired
	StoriesRepo storiesrepo;
	@PostMapping("/savestory")
	public String insterStory(@RequestBody Stories story)
	{
		System.out.println("hi"+story);
		storiesrepo.save(story);
		return "your record is saved successfully";
		
	}
	
	@PostMapping("/multiplestory")
	public String insterStory(@RequestBody List<Stories> story)
	{
		storiesrepo.saveAll(story);
		return "your record is saved successfully2";
		
	}
	
	@GetMapping("/getAllstories")
	public List<Stories> getStory()
	{
		return (List<Stories>) storiesrepo.findAll();
		
	}
	
	@PutMapping("/{id}")
	public Optional<Stories> updatestory(@RequestBody Stories story, @PathVariable("id") Long storyNo)
	{
		return Optional.ofNullable(this.storiesrepo.findById(storyNo)
				.orElseThrow(() -> new ResourceNotFoundException("story not found, storyNo", null, storyNo)));
						
	}
	
	/*@GetMapping("/getbyStoryName/{name}")
	public List<Stories> getStoryByName(@PathVariable ("name") String storyname)
	{
		return (List<Stories>) storiesrepo.findbystoryName(storyname);
		 
		
	}
	
	@GetMapping("/getbyStoryId/{bookId}")
	public Optional<Stories> getStoryById(@PathVariable("bookId") Long id)
	{
		return storiesrepo.findById(id);
		
		
	}*/
}

