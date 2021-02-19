package com.spring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Role;

public interface RolDao extends JpaRepository<Role, Integer>{

}
