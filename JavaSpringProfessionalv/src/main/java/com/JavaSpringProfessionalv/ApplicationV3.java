package com.JavaSpringProfessionalv;

import com.JavaSpringProfessionalv.entities.Employee;
import com.JavaSpringProfessionalv.service.SalaryService;
import com.JavaSpringProfessionalv.service.SalaryServiceV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationV3 implements CommandLineRunner {
	@Autowired
	SalaryServiceV3 salaryServiceV3;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationV3.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Edvaldo", 4000.00);
		System.out.println(salaryServiceV3.netSalary(employee));
	}
}
