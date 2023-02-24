package com.github.kressi.r2dbc.leak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeakApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeakApplication.class, args);
	}

}
