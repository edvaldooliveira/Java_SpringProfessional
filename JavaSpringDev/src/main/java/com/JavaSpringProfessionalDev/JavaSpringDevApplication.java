package com.JavaSpringProfessionalDev;

import com.JavaSpringProfessionalDev.entities.Predio;
import com.JavaSpringProfessionalDev.service.PredioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringDevApplication  implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(JavaSpringDevApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {

		Predio predio = new Predio(
				3500.0,
				1500.0,
				    350,
				    100,
				   150);

		PredioService predioService = new PredioService();

		predioService.adicionarPredio(predio);

		predioService.imprimirDadosDoPredio();



	}
}
