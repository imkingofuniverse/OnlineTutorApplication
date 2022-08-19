package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.example.demo.entity.Tutor;
import com.example.demo.exception.DuplicateTutorNameException;
import com.example.demo.repository.ITutorRepository;


public class ITutorServiceTest {
	
	@InjectMocks
	private ITutorServiceImpl itutorrepository;
	
	@Mock
	private ITutorRepository tutorrepository;
	
	
	public void insertTutorTest() throws DuplicateTutorNameException {
		
		Tutor tutor=new Tutor();
		tutor.setTutorId(1);
		tutor.setUsername("ram");
		tutor.setPassword("ram@123");
		tutor.setName("Ram");
		tutor.setMobile(999999999);
		tutor.setEmail("ram@gmail.com");
		tutor.setSchoolName("Delhi Public School");
		tutor.setQualification("m.tech");
		tutor.setSubject("Physics");
		tutor.setCity("Hyderabad");
		
		Mockito.doReturn(tutor).when(tutorrepository).save(Mockito.any());
		assertEquals(tutor.getTutorId(), itutorrepository.insertTutor(tutor).getTutorId());
		assertEquals(tutor.getUsername(), itutorrepository.insertTutor(tutor).getUsername());
		assertEquals(tutor.getPassword(), itutorrepository.insertTutor(tutor).getPassword());
		assertEquals(tutor.getName(), itutorrepository.insertTutor(tutor).getName());
		assertEquals(tutor.getMobile(), itutorrepository.insertTutor(tutor).getMobile());
		assertEquals(tutor.getEmail(), itutorrepository.insertTutor(tutor).getEmail());
		assertEquals(tutor.getSchoolName(), itutorrepository.insertTutor(tutor).getSchoolName());
		assertEquals(tutor.getQualification(), itutorrepository.insertTutor(tutor).getQualification());
		assertEquals(tutor.getSubject(), itutorrepository.insertTutor(tutor).getSubject());
		assertEquals(tutor.getCity(), itutorrepository.insertTutor(tutor).getCity());

	}
	
	public void updateTutorTest() {
		
		Tutor tutor=new Tutor();
		tutor.setTutorId(1);
		tutor.setName("Ram");
		tutor.setMobile(999999999);
		tutor.setEmail("ram@gmail.com");
		tutor.setSchoolName("Delhi Public School");
		tutor.setQualification("m.tech");
		tutor.setSubject("Physics");
		tutor.setCity("Hyderabad");
		
		Mockito.doReturn(tutor).when(tutorrepository).save(Mockito.any());
		assertEquals(tutor.getTutorId(), itutorrepository.updateTutor(tutor).getTutorId());
		assertEquals(tutor.getUsername(), itutorrepository.updateTutor(tutor).getUsername());
		assertEquals(tutor.getPassword(), itutorrepository.updateTutor(tutor).getPassword());
		assertEquals(tutor.getName(), itutorrepository.updateTutor(tutor).getName());
		assertEquals(tutor.getMobile(), itutorrepository.updateTutor(tutor).getMobile());
		assertEquals(tutor.getEmail(), itutorrepository.updateTutor(tutor).getEmail());
		assertEquals(tutor.getSchoolName(), itutorrepository.updateTutor(tutor).getSchoolName());
		assertEquals(tutor.getQualification(), itutorrepository.updateTutor(tutor).getQualification());
		assertEquals(tutor.getSubject(), itutorrepository.updateTutor(tutor).getSubject());
		assertEquals(tutor.getCity(), itutorrepository.updateTutor(tutor).getCity());

	}

}
