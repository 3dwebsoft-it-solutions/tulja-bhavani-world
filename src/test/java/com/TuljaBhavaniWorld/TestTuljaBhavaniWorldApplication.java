package com.TuljaBhavaniWorld;

import org.springframework.boot.SpringApplication;

public class TestTuljaBhavaniWorldApplication {

	public static void main(String[] args) {
		SpringApplication.from(TuljaBhavaniWorldApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
