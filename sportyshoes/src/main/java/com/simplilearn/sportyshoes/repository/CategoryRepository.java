package com.simplilearn.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.sportyshoes.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}