package com.spring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Usuario;

@Repository
public interface UserDAO extends JpaRepository<Usuario, Integer>{
	public Usuario findByUsername(String username);
}
