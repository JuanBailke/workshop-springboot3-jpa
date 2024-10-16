package com.workshop.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
