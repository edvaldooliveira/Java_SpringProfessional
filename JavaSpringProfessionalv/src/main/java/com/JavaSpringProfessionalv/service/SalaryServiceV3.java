package com.JavaSpringProfessionalv.service;

import com.JavaSpringProfessionalv.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceV3 {

    @Autowired
    TaxService taxService;
    @Autowired
    PensionService pensionService;



    public double netSalary(Employee employee) {
        double salarioBruto = employee.getGrossSalary() -
                                 taxService.tax(employee.getGrossSalary()) -
                                 pensionService.discount(employee.getGrossSalary());
        return salarioBruto;
    }


}
