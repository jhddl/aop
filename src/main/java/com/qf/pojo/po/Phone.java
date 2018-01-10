package com.qf.pojo.po;

public class Phone {
	private String name;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Phone() {
		super();
	}
	public Phone(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", id=" + id + "]";
	}
	
}
