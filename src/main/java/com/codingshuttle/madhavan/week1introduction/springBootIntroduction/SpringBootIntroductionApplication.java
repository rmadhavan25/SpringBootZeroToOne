package com.codingshuttle.madhavan.week1introduction.springBootIntroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroductionApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootIntroductionApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.bakeCake());
	}
}
