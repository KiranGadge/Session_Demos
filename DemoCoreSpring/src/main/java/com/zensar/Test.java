package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig2.xml");
		
		System.out.println("container started");
		Student s1 = (Student) ctx.getBean("sobj");
		System.out.println(s1);
		//Student s2 = (Student) ctx.getBean("sobj2");
		//System.out.println(s2);
	}
}
