package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Parent;
import com.example.demo.exception.ParentNotFoundException;
import com.example.demo.repository.ParentRepository;

@Service
public class ParentServiceImpl implements ParentService{

	@Autowired
	private ParentRepository parentrepository;
	
	@Override
	public Parent insertParent(Parent parent) {
		// TODO Auto-generated method stub
		return parentrepository.save(parent);
	}
	
	@Override
	public ResponseEntity<Parent> updateParent(Integer parentId, Parent parentDetails) throws ParentNotFoundException {
		Parent parentFound = this.parentrepository.findById(parentId)
				.orElseThrow(() -> new ParentNotFoundException("Parent does not exist with id:" + parentId));
		
		parentFound.setName(parentDetails.getName());
		parentFound.setMobile(parentDetails.getMobile());
		parentFound.setEmail(parentDetails.getEmail());
		parentFound.setCity(parentDetails.getCity());
		
		Parent updatedParent = parentrepository.save(parentFound);
		return ResponseEntity.ok(updatedParent);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteParent(Integer parentId) throws ParentNotFoundException {
		Parent parentFound = this.parentrepository.findById(parentId)
				.orElseThrow(() -> new ParentNotFoundException("Parent does not exist with id: " + parentId));
				
		this.parentrepository.delete(parentFound);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	} 

	@Override
	public List<Parent> showAllParents() {
		// TODO Auto-generated method stub
		return parentrepository.findAll();
	}

	



}
