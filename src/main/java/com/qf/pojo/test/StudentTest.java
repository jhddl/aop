package com.qf.pojo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qf.pojo.po.Student;

public class StudentTest {

	@Test
	public void test() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = ctx.getBean("student", Student.class);
		
		System.out.println(student);
	}

}
