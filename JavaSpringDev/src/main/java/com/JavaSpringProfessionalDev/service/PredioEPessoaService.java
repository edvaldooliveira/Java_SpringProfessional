package com.JavaSpringProfessionalDev.service;

import com.JavaSpringProfessionalDev.entities.Pessoa;
import com.JavaSpringProfessionalDev.entities.Predio;

import java.util.ArrayList;
import java.util.List;

public class PredioEPessoaService {

    private List<Pessoa> listaPessoa = new ArrayList<>();
    private List<Predio> listDePredio = new ArrayList<>();

    public void adicionarPredioEPessoa(Predio predio, Pessoa pessoa) {
        listDePredio.add(predio);
        listaPessoa.add(pessoa);
    }

    public void imprimirDadosDoPredioEDePessoa() {
        System.out.println("\nLista de Prédios:");
        System.out.println("-------------------------------");
        for (Predio predio : listDePredio) {
            System.out.printf("Quantidade pessoas: %d%n", predio.getQtdPessoas());
            System.out.printf("Quantidade de andares: %d%n", predio.getQtdAndares());
            System.out.printf("Valor do apartamento: R$ %.2f%n", predio.getValorApartamento());
            System.out.printf("Quantidade de garagem: %d%n", predio.getQtdGaragem());
            System.out.printf("Valor do condomínio: R$ %.2f%n", predio.getValorCondominio());
            System.out.println("-------------------------------");
        }
        System.out.println("\nLista de Pessoas:");
        for (Pessoa pessoa : listaPessoa) {
            System.out.printf("Nome pessoas: %s%n", pessoa.getNome());
            System.out.printf("CPF: %s%n", pessoa.getCpf());

            System.out.println("-------------------------------");
        }
    }

    public List<Predio> getList() {
        return listDePredio;
    }
}
