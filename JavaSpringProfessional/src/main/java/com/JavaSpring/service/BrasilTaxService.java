package com.JavaSpring.service;

public class BrasilTaxService extends TaxService {

    public double tax(double amount) {
        return amount * 0.3;

    }

}
