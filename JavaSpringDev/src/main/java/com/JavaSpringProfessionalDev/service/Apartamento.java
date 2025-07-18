package com.JavaSpringProfessionalDev.service;

public class Apartamento {
    private double valor;
    private int qtdQuartos;

    public Apartamento(double valor, int qtdQuartos) {
        this.valor = valor;
        this.qtdQuartos = qtdQuartos;
    }

    public double getValor() {
        return valor;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "valor=" + valor +
                ", qtdQuartos=" + qtdQuartos +
                '}';
    }
}
