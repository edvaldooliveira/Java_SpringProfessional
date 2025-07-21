package com.JavaSpringProfessionalDev.service;

import com.JavaSpringProfessionalDev.entities.Pessoa;
import com.JavaSpringProfessionalDev.entities.Predio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class PredioEPessoaServiceV2 {

    @Autowired
    private PredioService predioService;

    Map<Predio, List<Pessoa>> prediosComMoradores = new HashMap<>();

    public void adicionarMoradorAoPredio(Predio predio, Pessoa pessoa){
        prediosComMoradores.putIfAbsent(predio, new ArrayList<>());
        prediosComMoradores.get(predio).add(pessoa);
    }

    public void imprimirDadosDosPrediosComMoradores(){

       for (Map.Entry<Predio, List<Pessoa>> entry : prediosComMoradores.entrySet()){
           Predio predio = entry.getKey();
           List<Pessoa> moradores = entry.getValue();

           System.out.println("\n--- Dados do Prédio ---");
           System.out.printf("Nome do Predio: %s%n", predio.getNome());
           System.out.printf("Qtd. Pessoas: %d%n", predio.getQtdPessoas());
           System.out.printf("Qtd. Andares: %d%n", predio.getQtdAndares());
           System.out.printf("Qtd. Garagem: %d%n", predio.getQtdGaragem());
           System.out.printf("Valor Apartamento: R$ %.2f%n", predio.getValorApartamento());
           System.out.printf("Valor Condomínio: R$ %.2f%n", predio.getValorCondominio());

          System.out.printf("Despesas predio: R$ %.2f%n", predioService.somarDespesas(predio));
          
           System.out.println("\n--- Dados de Moradores ---");
           for (Pessoa pessoa : moradores){
               System.out.printf("Nome: %s | CPF: %s%n", pessoa.getNome(), pessoa.getCpf());

           }

       }
    }

}
