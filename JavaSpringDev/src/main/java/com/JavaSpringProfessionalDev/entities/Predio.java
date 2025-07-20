package com.JavaSpringProfessionalDev.entities;


import java.util.Objects;

public class Predio {
    private String nome;
    private Integer qtdPessoas;

    private Integer  qtdAndares;

    private Integer qtdGaragem;
    private Double valorApartamento;
    private Double valorCondominio;


    public Predio() {
    }

    public Predio(String nome, Double valorApartamento, Double valorCondominio, Integer qtdPessoas, Integer qtdAndares, Integer qtdGaragem) {
        this.valorApartamento = valorApartamento;
        this.valorCondominio = valorCondominio;
        this.qtdPessoas = qtdPessoas;
        this.qtdAndares = qtdAndares;
        this.qtdGaragem = qtdGaragem;
        this.nome = nome;
    }

    public Double getValorApartamento() {
        return valorApartamento;
    }

    public void setValorApartamento(Double valorApartamento) {
        this.valorApartamento = valorApartamento;
    }

    public Double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(Double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Integer getQtdAndares() {
        return qtdAndares;
    }

    public void setQtdAndares(Integer qtdAndares) {
        this.qtdAndares = qtdAndares;
    }

    public Integer getQtdGaragem() {
        return qtdGaragem;
    }

    public void setQtdGaragem(Integer qtdGaragem) {
        this.qtdGaragem = qtdGaragem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predio predio = (Predio) o;
        return Objects.equals(qtdPessoas, predio.qtdPessoas) &&
                Objects.equals(qtdAndares, predio.qtdAndares) &&
                Objects.equals(qtdGaragem, predio.qtdGaragem) &&
                Objects.equals(valorApartamento, predio.valorApartamento) &&
                Objects.equals(valorCondominio, predio.valorCondominio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qtdPessoas, qtdAndares, qtdGaragem, valorApartamento, valorCondominio);
    }

}

