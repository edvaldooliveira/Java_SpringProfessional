package com.JavaSpringProfessionalDev.service;

import com.JavaSpringProfessionalDev.entities.Predio;
import org.springframework.stereotype.Service;

@Service
public class PredioService {

    public double somarDespesas(Predio predio){
      return predio.getValorCondominio() + predio.getValorApartamento();
    }

}
