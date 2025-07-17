package com.JavaSpring.service;

import com.JavaSpring.entities.Employee;

public class SalaryServiceV2 {
     TaxService taxService;
     PensionService pensionService;

    public SalaryServiceV2(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {

        double salarioLiquido  = employee.getGrossSalary() -
                taxService.tax(employee.getGrossSalary()) -
                pensionService.discount(employee.getGrossSalary());

        return salarioLiquido ;
    }
}


