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

import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminAlreadyExistsException;
import com.example.demo.exception.AdminNotFoundException;
import com.example.demo.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/insertAdmin")
	public Admin insertAdmin(@RequestBody Admin admin) throws AdminAlreadyExistsException
	{
		return adminService.insertAdmin(admin);
		
	}
	
	@PutMapping("/updateAdmin/{AdminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable Integer adminId , @RequestBody Admin adminDetails) throws AdminAlreadyExistsException
	{
		return adminService.updateAdmin(adminId,adminDetails);
			
	}
	
	@DeleteMapping("/deleteAdmin/{AdminId}")
	public ResponseEntity<Map<String , Boolean>> deleteAdmin(@PathVariable Integer AdminId) throws AdminNotFoundException
	{
		return adminService.deleteAdmin(AdminId);
		
	}
	
	@PostMapping("/insertBook")
	public Admin insertBook(@RequestBody Admin Admin ) 
	{
		return adminService.insertBook(Admin);
		
	}
	
	@GetMapping("/Books")
	public List<Admin> getAllBooks() {
		return adminService.getAllBooks();
		
	}
	

}
