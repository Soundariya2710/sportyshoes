package com.simplilearn.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.sportyshoes.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}