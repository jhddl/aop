package com.qf.pojo.po;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private Integer id;
	private String name;
	private Phone phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		System.out.println("+++我进来了+++");
	}
	public Student(Integer id, String name, Phone phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
