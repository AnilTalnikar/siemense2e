package com.vinsys.e2eapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class E2eappApplication {

	public static void main(String[] args) {
		System.out.println("Inside Main....");
		SpringApplication.run(E2eappApplication.class, args);
	}
}
