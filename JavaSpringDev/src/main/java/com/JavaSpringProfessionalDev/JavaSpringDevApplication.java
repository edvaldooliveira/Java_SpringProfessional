package com.JavaSpringProfessionalDev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringDevApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringDevApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Edvaldo teste agora");
	}
}
