package com.example.demo.model;

import lombok.Data;

@Data
public class Student {
	
	public String name;
	public String age;
	public String phno;
	public String address;
	
	public String getName() {
	   return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	}

