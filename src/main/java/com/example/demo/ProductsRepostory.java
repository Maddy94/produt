package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepostory extends JpaRepository<Products, Integer> {

}
