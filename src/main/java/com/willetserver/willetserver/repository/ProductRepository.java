package com.willetserver.willetserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willetserver.willetserver.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
