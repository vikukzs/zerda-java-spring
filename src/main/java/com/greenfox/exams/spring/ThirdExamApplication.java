package com.greenfox.exams.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class ThirdExamApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(ThirdExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
