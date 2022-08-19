package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tutor;
import com.example.demo.exception.DuplicateTutorNameException;
import com.example.demo.exception.TutorNotFoundException;
import com.example.demo.repository.ITutorRepository;



@Service
public class ITutorServiceImpl implements ITutorService {
	
	@Autowired
	private ITutorRepository itutorrepository;
	
	@Override
	public Tutor insertTutor(Tutor tutorr) throws DuplicateTutorNameException {
		
		Tutor tutor = new Tutor();
		tutor.setTutorId(tutorr.getTutorId());
		tutor.setUsername(tutorr.getUsername());
		tutor.setPassword(tutorr.getPassword());
		tutor.setName(tutorr.getName());
		tutor.setMobile(tutorr.getMobile());
		tutor.setEmail(tutorr.getEmail());
		tutor.setSchoolName(tutorr.getSchoolName());
		tutor.setQualification(tutorr.getQualification());
		tutor.setSubject(tutorr.getSubject());
		tutor.setCity(tutorr.getCity());
		
		List<Tutor> tutorrr = itutorrepository.findAll();
		for(Tutor t : tutorrr) {
		if(t.getName().equals(tutorr.getName())) {
		throw new DuplicateTutorNameException("Name Already Exists");
		}
		}		
		
		return itutorrepository.save(tutor);
	}
	
	@Override
	public Tutor updateTutor(Tutor tutorr) {
		
		Tutor tutor = new Tutor();
		tutor.setTutorId(tutorr.getTutorId());
		tutor.setUsername(tutorr.getUsername());
		tutor.setPassword(tutorr.getPassword());
		tutor.setName(tutorr.getName());
		tutor.setMobile(tutorr.getMobile());
		tutor.setEmail(tutorr.getEmail());
		tutor.setSchoolName(tutorr.getSchoolName());
		tutor.setQualification(tutorr.getQualification());
		tutor.setSubject(tutorr.getSubject());
		tutor.setCity(tutorr.getCity());
		
		return itutorrepository.save(tutor);
	}
	
	@Override
	public Tutor deleteTutor(Tutor tutor) throws TutorNotFoundException {
		
		itutorrepository.delete(tutor);
		
		if(tutor == null)
			throw new TutorNotFoundException("Tutor Not Found Exception");
		return tutor;
	}
	
	@Override
	public List<Tutor> viewTutorOfSubject(String subject) throws TutorNotFoundException {
		
		List<Tutor> tutor = itutorrepository.findAll();
		
		
		return tutor.stream().filter((d) -> d.getSubject().equalsIgnoreCase(subject)).collect(Collectors.toList());
	}
	
	@Override
	public List<Tutor> viewTutorOfCity(String city) throws TutorNotFoundException {
		
		List<Tutor> tutor = itutorrepository.findAll();
		
		
		return tutor.stream().filter((d) -> d.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	}
	
	@Override
	public int countTutorOfSubject(String subject) throws TutorNotFoundException {
		
		List<Tutor> cab = itutorrepository.findAll();
		List<Tutor> c = cab.stream().filter((d) -> d.getSubject().equalsIgnoreCase(subject)).collect(Collectors.toList());
		int n = c.size();

		return n;
		
	}
	
	@Override
	public List<Tutor> viewAllTutors() throws TutorNotFoundException {
	
		return itutorrepository.findAll();
	}

}
