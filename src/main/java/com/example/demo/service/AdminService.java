package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminAlreadyExistsException;
import com.example.demo.exception.AdminNotFoundException;


public interface AdminService {
	
	public Admin insertAdmin(Admin AdminDetails) throws AdminAlreadyExistsException;
	
	public ResponseEntity<Admin> updateAdmin(Integer AdminId , Admin AdminDetails) throws AdminAlreadyExistsException;
	
	public ResponseEntity<Map<String, Boolean>> deleteAdmin(Integer AdminId) throws AdminNotFoundException;
	
	public Admin insertBook(Admin BookDetails);
	
	public List<Admin> getAllBooks();

}
