package com.JavaSpringProfessionalv.service;

import com.JavaSpringProfessionalv.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    TaxService taxService;
    PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        double salarioBruto = employee.getGrossSalary() -
                                 taxService.tax(employee.getGrossSalary()) -
                                 pensionService.discount(employee.getGrossSalary());
        return salarioBruto;
    }


}
