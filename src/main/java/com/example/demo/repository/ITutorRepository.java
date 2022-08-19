package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tutor;

@Repository
public interface ITutorRepository extends JpaRepository<Tutor, String>{

}
