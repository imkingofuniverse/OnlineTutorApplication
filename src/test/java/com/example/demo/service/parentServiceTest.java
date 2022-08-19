package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Parent;
import com.example.demo.repository.ParentRepository;

@SpringBootTest
public class parentServiceTest {

	@InjectMocks
	private ParentServiceImpl parentService;
	
	@Mock
	private ParentRepository parentRepository;
	
	@Test
	public void insertParentTest(){
		
		Parent parent=new Parent();
		parent.setParentId(1);
		parent.setName("Nikhil");
		parent.setMobile("9898989898");
		parent.setEmail("nikhil@gmail.com");
		parent.setCity("Kolhapur");
		
		Mockito.doReturn(parent).when(parentRepository).save(Mockito.any());
		assertEquals(parent.getParentId(), parentService.insertParent(parent).getParentId());
		assertEquals(parent.getName(), parentService.insertParent(parent).getName());
		assertEquals(parent.getMobile(),parentService.insertParent(parent).getMobile());
		assertEquals(parent.getEmail(),parentService.insertParent(parent).getEmail());
		assertEquals(parent.getCity(),parentService.insertParent(parent).getCity());
	}
	
	
}
