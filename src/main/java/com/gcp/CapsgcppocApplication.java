package com.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.gcp.*")
@SpringBootApplication
public class CapsgcppocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapsgcppocApplication.class, args);
	}

}
