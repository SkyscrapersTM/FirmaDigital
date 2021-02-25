package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.Empresa;
import com.spring.model.service.EmpresaService;

@Controller
@RequestMapping("/skyscrapers")
public class EmpresaController {

	/*
	@GetMapping("/listar")
	public String listar() {
		return "listar";
	}
*/
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empresa> empresas = empresaService.listar();
		model.addAttribute("empresas", empresas);
		return "listar";
	}

	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		Empresa empresa = new Empresa();
		model.addAttribute("empresa", empresa);
		return "frmCrear";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Empresa empresa) {
		empresaService.save(empresa);
		return "redirect:/skyscrapers/listar";
	}
	
	@GetMapping("/buscarPorId/{id}")
	public String buscarPorId(@PathVariable("id")Integer idempresa, Model model){
	Empresa empresa = empresaService.buscarPorId(idempresa);
	model.addAttribute("titulo", "Formulario: Editar Empresa");
	model.addAttribute("empresa", empresa);
		return "frmCrear";
		}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id")Integer idempresa) {
		empresaService.eliminar(idempresa);
		return "redirect:/skyscrapers/listar";
	}
	
}
