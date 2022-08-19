package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminAlreadyExistsException;
import com.example.demo.repository.AdminRepository;

@SpringBootTest
public class AdminServiceTest {
	
	@InjectMocks
	private AdminServieImpl adminService;
	
	@Mock
	private AdminRepository adminRepository;

	@Test
	public void insertAdminTest() throws AdminAlreadyExistsException
	{
		Admin admin=new Admin();
		admin.setAdminId(1);
		admin.setAdminName("Pranav");
		
		

			
	
		Mockito.doReturn(admin).when(adminRepository).save(Mockito.any());
		assertEquals(admin.getAdminId(),adminService.insertAdmin(admin).getAdminId());
		assertEquals(admin.getAdminName(),adminService.insertAdmin(admin).getAdminName());
	}	
	
	@Test
	public void updateAdminTest() throws AdminAlreadyExistsException
	{
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setAdminName("Pranav");
		
		Mockito.doReturn(admin).when(adminRepository).save(Mockito.any());
		assertEquals(admin.getAdminId(),adminService.insertAdmin(admin).getAdminId());
		assertEquals(admin.getAdminName(),adminService.insertAdmin(admin).getAdminName());
		
		
		
	}

}
