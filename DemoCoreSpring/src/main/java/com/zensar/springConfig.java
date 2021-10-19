package com.zensar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@ComponentScan and @Bean are complementary to each other
@ComponentScan(basePackages = "com.zensar")
@Configuration
public class springConfig {

	/*
	 * @Bean public Employee emp() { return new Employee();
	 * 
	 * }
	 */
}
