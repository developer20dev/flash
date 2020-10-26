package com.cp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cp")
public class MyDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyDemoApplication.class, args);
	}

}
