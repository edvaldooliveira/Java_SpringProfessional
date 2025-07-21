package com.JavaSpringProfessionalDev;

import com.JavaSpringProfessionalDev.entities.Pessoa;
import com.JavaSpringProfessionalDev.entities.Predio;
import com.JavaSpringProfessionalDev.service.PredioEPessoaService;
import com.JavaSpringProfessionalDev.service.PredioEPessoaServiceV2;
import com.JavaSpringProfessionalDev.service.PredioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class JavaSpringDevApplication  implements CommandLineRunner {

	@Autowired
	PredioEPessoaServiceV2 predioEPessoaServiceV2;

	public static void main(String[] args) {SpringApplication.run(JavaSpringDevApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		Predio predio = new Predio("Cantinho do Sossego",7000.00, 1500.0, 400, 30,150);
		Predio predioe = new Predio("Parque das Águas",9000.00, 2500.0, 800, 40,350);

		Pessoa pessoa = new Pessoa("Larissy Rocha Oliveira", "775819111-87");
		Pessoa pessoai = new Pessoa("Isaac Rocha Oliveira", "775819111-00");

		Pessoa pessoae = new Pessoa("Edvaldo Ferreira de Oliveira", "775819111-99");
		Pessoa pessoad = new Pessoa("Djane Ferreira de Oliveira", "775819111-77");

		predioEPessoaServiceV2.adicionarMoradorAoPredio(predio,pessoa);
		predioEPessoaServiceV2.adicionarMoradorAoPredio(predio,pessoai);

		predioEPessoaServiceV2.adicionarMoradorAoPredio(predioe,pessoae);
		predioEPessoaServiceV2.adicionarMoradorAoPredio(predioe,pessoad);

		predioEPessoaServiceV2.imprimirDadosDosPrediosComMoradores();

	}
}
