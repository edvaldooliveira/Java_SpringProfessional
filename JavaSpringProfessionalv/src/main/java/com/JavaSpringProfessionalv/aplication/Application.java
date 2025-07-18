package com.JavaSpringProfessionalv.aplication;

import com.JavaSpringProfessionalv.entities.Employee;
import com.JavaSpringProfessionalv.service.PensionService;
import com.JavaSpringProfessionalv.service.SalaryService;
import com.JavaSpringProfessionalv.service.TaxService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o salario :");
		double salario = sc.nextDouble();

		Employee employee = new Employee(nome, salario);
		TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();

		SalaryService salaryService = new SalaryService(taxService, pensionService);
		double salarioLiquido = salaryService.netSalary(employee);
		System.out.printf("Salario Liquido: %.2f", salarioLiquido);

	}

}
