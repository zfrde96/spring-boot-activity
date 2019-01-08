package com.dfrc.ygfw;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class YgfwApplication {

	public static void main(String[] args) {
		SpringApplication.run(YgfwApplication.class, args);
	}

}

