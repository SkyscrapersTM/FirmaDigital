package com.spring.model.service;

import java.util.List;
import java.util.Optional;

import com.spring.entity.Trabajador;


public interface TrabajadorService {

	public List<Trabajador> listarTrabajadores();
	public Optional<Trabajador>listarId(Integer id);
	public int save(Trabajador t);
	public Trabajador buscarPorId(Integer id);
	public void eliminar(Integer id);
}
