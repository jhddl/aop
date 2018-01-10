package com.qf.pojo.factory;

import com.qf.pojo.po.Student;

public class PersonFactory {
	
	public  static Student  creatStudent(){
	
			Student student = new Student();
			return student;
	}
}
