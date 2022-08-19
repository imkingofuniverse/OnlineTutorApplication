package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="parent")
public class Parent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;
	
	private String name;
	private String mobile;
	private String email;
	private String city;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(int parentId, String name, String mobile, String email, String city) {
		super();
		this.parentId = parentId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.city = city;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
