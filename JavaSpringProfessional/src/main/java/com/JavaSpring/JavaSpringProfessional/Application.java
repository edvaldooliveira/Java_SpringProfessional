package com.JavaSpring.JavaSpringProfessional;

import com.JavaSpring.service.PensionService;
import com.JavaSpring.service.TaxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("\nInforme a taxa: ");
		double taxa = sc.nextDouble();

		System.out.print("Informe Pension Service: ");
		double pension = sc.nextDouble();

		TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();

	double resultado =	taxService.tax(taxa);
		System.out.printf("\n Tax: %.2f\n ",resultado);

		double resultadoPension = pensionService.discount(pension);
		System.out.printf("Discount: %.2f ", resultadoPension);





//versão de teste

	}

}

