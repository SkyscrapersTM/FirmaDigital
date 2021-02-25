package com.spring.model.service;

import java.util.List;
import java.util.Optional;

import com.spring.entity.PlanBolsaFirma;

public interface PlanBolsaFirmaService {

	public List<PlanBolsaFirma> listarPlanes();
	public Optional<PlanBolsaFirma> listarPorId(Integer id);
	public int save(PlanBolsaFirma obj);
	public PlanBolsaFirma buscarPorId(Integer id);
	public void eliminar(Integer id);
}
	

