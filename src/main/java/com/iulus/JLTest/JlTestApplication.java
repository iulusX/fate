package com.iulus.JLTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.iulus")
@SpringBootApplication
public class JlTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JlTestApplication.class, args);
	}

}
