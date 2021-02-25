package com.spring.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.DocumentoII;

public interface DocumentoDAO extends JpaRepository<DocumentoII, Integer> {

}
