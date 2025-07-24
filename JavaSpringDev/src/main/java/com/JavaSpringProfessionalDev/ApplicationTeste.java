package com.JavaSpringProfessionalDev;

import com.JavaSpringProfessionalDev.service.Cliente;
import com.JavaSpringProfessionalDev.service.Pedito;

//@SpringBootApplication
public class ApplicationTeste  {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Edvaldo Ferreira de Oliveira");
		Pedito pedito = new Pedito(cliente);

		System.out.printf("\nNome: %s%n", pedito.mostrarNome());

	}
}
