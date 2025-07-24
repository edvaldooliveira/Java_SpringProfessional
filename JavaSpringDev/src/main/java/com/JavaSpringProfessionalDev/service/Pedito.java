package com.JavaSpringProfessionalDev.service;

public class Pedito {
    private Cliente cliente;
    public Pedito(Cliente cliente) {
        this.cliente = cliente;
    }
    public String mostrarNome() {
        return cliente.getNome();
    }

}
