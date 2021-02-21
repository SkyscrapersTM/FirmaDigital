package com.spring.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Documento;

@Repository
public interface DocumentoRepository extends CrudRepository<Documento, Integer>{


	
}
