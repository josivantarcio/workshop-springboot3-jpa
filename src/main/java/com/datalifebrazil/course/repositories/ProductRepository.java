package com.datalifebrazil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datalifebrazil.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
