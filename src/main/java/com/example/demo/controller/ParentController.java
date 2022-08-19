package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parent;
import com.example.demo.exception.ParentNotFoundException;
import com.example.demo.service.ParentService;

@RestController
@RequestMapping("/parent")

public class ParentController {
	
	@Autowired
	private ParentService parentService;
	
	@PostMapping("/insertParent")
	public Parent insertParent(@RequestBody Parent parent){
	return parentService.insertParent(parent);
	}
	
	@PutMapping("/updateParent/{ParentId}")
	public ResponseEntity<Parent> updateParent(@PathVariable Integer ParentId,@RequestBody Parent parentDetails) throws ParentNotFoundException{
	return parentService.updateParent (ParentId, parentDetails);
	}
	
	@DeleteMapping("/deleteParent/{ParentId}")
	public ResponseEntity<Map<String, Boolean>> deleteParent(@PathVariable Integer ParentId) throws ParentNotFoundException {
	return parentService.deleteParent(ParentId);
	}
	
	@GetMapping("/parent")
	public List<Parent> showAllParents(){
		return parentService.showAllParents();
		}

}
