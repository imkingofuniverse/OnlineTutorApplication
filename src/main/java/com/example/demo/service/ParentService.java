package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Parent;
import com.example.demo.exception.ParentNotFoundException;

public interface ParentService {
	
	public Parent insertParent(Parent parent);

	public ResponseEntity<Parent> updateParent(Integer ParentId, Parent parentDetails) throws ParentNotFoundException;

	public ResponseEntity<Map<String, Boolean>> deleteParent(Integer ParentId) throws ParentNotFoundException;

	public List<Parent> showAllParents();

}
