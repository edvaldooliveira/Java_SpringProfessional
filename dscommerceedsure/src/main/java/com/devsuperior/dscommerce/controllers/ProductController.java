package com.devsuperior.dscommerce.controllers;

import com.devsuperior.dscommerce.dto.ProductDTO;

import com.devsuperior.dscommerce.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

   @Autowired
    private ProductService service;


    @GetMapping(value = "/{id}")
   public ProductDTO findById(@PathVariable Long id) {
    return service.findById(id);

    }

}
