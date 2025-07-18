package com.JavaSpringProfessionalDev.entities;

public class Pessoa {
    private String nome;
    private int numeroAp;
    private double valorCond;

    public Pessoa(String nome, int numeroAp, double valorCond) {
        this.nome = nome;
        this.numeroAp = numeroAp;
        this.valorCond = valorCond;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroAp() {
        return numeroAp;
    }

    public double getValorCond() {
        return valorCond;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", numeroAp=" + numeroAp +
                ", valorCond=" + valorCond +
                '}';
    }
}
