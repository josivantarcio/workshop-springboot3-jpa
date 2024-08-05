package com.datalifebrazil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datalifebrazil.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
