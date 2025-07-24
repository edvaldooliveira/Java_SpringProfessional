package com.devsuperior.dscommerce.repository;

import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<Product, Long> {
}
