package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Tutor;
import com.example.demo.exception.DuplicateTutorNameException;
import com.example.demo.exception.TutorNotFoundException;


public interface ITutorService {
	
	public Tutor insertTutor(Tutor tutor) throws DuplicateTutorNameException;

	public Tutor updateTutor(Tutor tutor);

	public Tutor deleteTutor(Tutor tutor) throws TutorNotFoundException;

	public List<Tutor> viewTutorOfSubject(String subject) throws TutorNotFoundException;
	
	public List<Tutor> viewTutorOfCity(String city) throws TutorNotFoundException;

	public int countTutorOfSubject(String subject) throws TutorNotFoundException;
	
	public List<Tutor> viewAllTutors() throws TutorNotFoundException;


}
