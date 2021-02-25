package com.spring.model.service;

import java.util.List;
import java.util.Optional;

import com.spring.entity.Empresa;

public interface EmpresaService {

	public List<Empresa> listar();
	public Optional<Empresa>listarId(Integer id);
	public int save(Empresa e);
	public Empresa buscarPorId(Integer id);
	public void eliminar(Integer id);
}
	

