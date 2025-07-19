package com.JavaSpringProfessionalDev.entities;


public class Predio {

    private Integer qtdPessoas;

    private Integer  qtdAndares;

    private Integer qtdGaragem;
    private Double valorApartamento;
    private Double valorCondominio;


    public Predio() {
    }

    public Predio(Double valorApartamento, Double valorCondominio, Integer qtdPessoas, Integer qtdAndares, Integer qtdGaragem) {
        this.valorApartamento = valorApartamento;
        this.valorCondominio = valorCondominio;
        this.qtdPessoas = qtdPessoas;
        this.qtdAndares = qtdAndares;
        this.qtdGaragem = qtdGaragem;
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



    @Override
    public String toString() {
        return "Predio{" +
                "valorApartamento=" + valorApartamento +
                ", valorCondominio=" + valorCondominio +
                ", qtdPessoas=" + qtdPessoas +
                ", qtdAndares=" + qtdAndares +
                ", qtdGaragem=" + qtdGaragem +
                '}';
    }
}

