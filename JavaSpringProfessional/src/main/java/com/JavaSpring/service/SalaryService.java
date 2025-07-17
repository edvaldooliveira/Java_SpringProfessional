package com.JavaSpring.service;

import com.JavaSpring.entities.Employee;

public class SalaryService {
     TaxService taxService = new TaxService();
     PensionService pensionService = new PensionService();


    public double netSalary(Employee employee) {

        double salarioBruto = employee.getGrossSalary();
        double resultTaxService = taxService.tax(salarioBruto);
        double reusltPensionService = pensionService.discount(salarioBruto);
        double  salarioLiquido  = salarioBruto - reusltPensionService - resultTaxService;

        return salarioLiquido;
    }
}


