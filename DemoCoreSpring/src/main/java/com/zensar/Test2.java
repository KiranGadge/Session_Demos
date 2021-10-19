package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
		System.out.println("Container started");
		//These lines are used for @componentscan
		//Employee e1=ctx.getBean("emp",Employee.class);
		//System.out.println(e1);
		//These lines are used for @Bean
		Employee ee =(Employee) ctx.getBean("emp");
		System.out.println(ee);
	}
}
