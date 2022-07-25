package com.example.Versioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

@SpringBootApplication
public class VersioningApplication {
	private File file;



	public static void main(String[] args) {
		SpringApplication.run(VersioningApplication.class, args);
	}

}
