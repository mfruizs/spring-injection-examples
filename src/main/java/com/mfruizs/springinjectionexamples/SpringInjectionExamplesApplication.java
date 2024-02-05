package com.mfruizs.springinjectionexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.mfruizs")
@SpringBootApplication
public class SpringInjectionExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInjectionExamplesApplication.class, args);
	}

}
