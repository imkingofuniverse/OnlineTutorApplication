package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminAlreadyExistsException;
import com.example.demo.exception.AdminNotFoundException;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminServieImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	public Admin insertAdmin(Admin AdminDetails) throws AdminAlreadyExistsException
	{
		List<Admin> adminn = adminRepository.findAll();
		for(Admin a : adminn)
		{
			if(a.getAdminName().equals(AdminDetails.getAdminName()))
			{
				{
					throw new AdminAlreadyExistsException("Admin already exists with name :" +a.getAdminName());
				}
				
			}
			else
			{
				break;
			}
		}
		return adminRepository.save(AdminDetails);
		
		
	}

	@Override
	public ResponseEntity<Admin> updateAdmin(Integer AdminId, Admin AdminDetails) throws AdminAlreadyExistsException {
		// TODO Auto-generated method stub
		
		
		List<Admin> Books = adminRepository.findAll();
		for(Admin a : Books)
		{
			if(a.getAdminName().equals(AdminDetails.getAdminName()))
			{
				{
					throw new AdminAlreadyExistsException("Book not found with id :" +AdminId);
				}
				
			}
			else
			{
				break;
			}
		}
		
		
		Admin admin = new Admin();
		admin.setAdminName(AdminDetails.getAdminName());
		Admin updateAdmin = adminRepository.save(admin);
		
		return ResponseEntity.ok(updateAdmin);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteAdmin(Integer AdminId) throws AdminNotFoundException {
		// TODO Auto-generated method stub
		Admin adminFound = this.adminRepository.findById(AdminId).orElseThrow(() -> new AdminNotFoundException("Admin not found with id :" +AdminId));
		
		this.adminRepository.delete(adminFound);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deleted" , Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	@Override
	public Admin insertBook(Admin BookDetails) {
		// TODO Auto-generated method stub
		
		
		return adminRepository.save(BookDetails);
	}

	@Override
	public List<Admin> getAllBooks() {
		// TODO Auto-generated method stub
		
		
		return adminRepository.findAll();
	}

}
