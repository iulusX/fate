package com.iulus.fate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.iulus")
@SpringBootApplication
public class FateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FateApplication.class, args);
	}

}
