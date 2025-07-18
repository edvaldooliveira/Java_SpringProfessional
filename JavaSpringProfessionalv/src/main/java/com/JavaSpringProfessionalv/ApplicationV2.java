package com.JavaSpringProfessionalv;

import com.JavaSpringProfessionalv.entities.Employee;
import com.JavaSpringProfessionalv.service.PensionService;
import com.JavaSpringProfessionalv.service.SalaryService;
import com.JavaSpringProfessionalv.service.TaxService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationV2 implements CommandLineRunner {
	SalaryService salaryService;

	public ApplicationV2(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationV2.class, args);



	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Edvaldo", 4000.00);
		System.out.println(salaryService.netSalary(employee));
	}
}
