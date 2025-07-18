package com.JavaSpringProfessionalDev.service;

import java.util.ArrayList;
import java.util.List;

public class Predio {

    private Integer numeroPred;
    private Integer qtdAp;

    List<Apartamento> apartamentos = new ArrayList<>();

    public Predio(Integer numeroPred, Integer qtdAp) {
        this.numeroPred = numeroPred;
        this.qtdAp = qtdAp;
    }

    public void adicionarApartamento(Apartamento ap) {
        apartamentos.add(ap);
    }

    public void imprimirApartamentos() {
        for (Apartamento ap : apartamentos) {
            System.out.println(getApartamentos());
        }
    }

    public Integer getNumeroPred() {
        return numeroPred;
    }

    public void setNumeroPred(Integer numeroPred) {
        this.numeroPred = numeroPred;
    }

    public Integer getQtdAp() {
        return qtdAp;
    }

    public void setQtdAp(Integer qtdAp) {
        this.qtdAp = qtdAp;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

}
