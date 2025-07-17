package com.JavaSpring.JavaSpringProfessional;

import com.JavaSpring.entities.Employee;
import com.JavaSpring.service.PensionService;
import com.JavaSpring.service.SalaryService;
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


		System.out.printf("\nInforme o nome: ");
		String name = sc.nextLine();

		System.out.print("Informe o valor: ");
		double salario = sc.nextDouble();


		Employee employee = new Employee(name, salario);
		SalaryService salaryService = new SalaryService();

	    double SalarioComDesconto  = salaryService.netSalary(employee);

		System.out.printf("\n Nome : %s%n ", employee.getName());
		System.out.printf("Salário bruto: %.2f\n", employee.getGrossSalary());
		System.out.printf(" Salario liquido = %.2f ", SalarioComDesconto);


	}

}

