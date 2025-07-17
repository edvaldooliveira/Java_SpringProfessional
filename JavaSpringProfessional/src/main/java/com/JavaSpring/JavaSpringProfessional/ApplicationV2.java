package com.JavaSpring.JavaSpringProfessional;

import com.JavaSpring.entities.Employee;
import com.JavaSpring.service.PensionService;
import com.JavaSpring.service.SalaryServiceV2;
import com.JavaSpring.service.TaxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ApplicationV2 {

	public static void main(String[] args) {SpringApplication.run(ApplicationV2.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();

		System.out.printf("\nInforme o nome: ");
		String name = sc.nextLine();

		System.out.print("Informe o valor: ");
		double salario = sc.nextDouble();

		Employee employee = new Employee(name, salario);
		SalaryServiceV2 salaryServiceV2 = new SalaryServiceV2(taxService, pensionService);

	    double salarioComDesconto  = salaryServiceV2.netSalary(employee);

		System.out.printf("\n Nome : %s%n ", employee.getName());
		System.out.printf("Salário bruto: %.2f\n", employee.getGrossSalary());
		System.out.printf(" Salario liquido = %.2f ", salarioComDesconto);

		sc.close();
	}
}

