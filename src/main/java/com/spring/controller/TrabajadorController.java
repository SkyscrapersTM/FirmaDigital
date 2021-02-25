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

import com.spring.entity.Trabajador;
import com.spring.model.dao.RolDao;
import com.spring.model.service.TrabajadorService;

@Controller
@RequestMapping("/skyscrapers")
public class TrabajadorController {

		
	@Autowired
	private TrabajadorService trabajadorService;
	
	@Autowired
	private RolDao rolrepository;
	
	@GetMapping("/listarTrabajadores")
	public String listarTrabajadores(Model model) {
		List<Trabajador> trabajadores = trabajadorService.listarTrabajadores();
		model.addAttribute("trabajadores", trabajadores);
		model.addAttribute("roles", rolrepository.findAll());
		return "listarTrabajadores";
	}

	@GetMapping("/nuevoTrabajador")
	public String nuevoTrabajador(Model model) {
		Trabajador trabajador = new Trabajador();
		model.addAttribute("trabajador", trabajador);
		return "frmCrearTrabajador";
	}
	
	@PostMapping("/saveTrabajador")
	public String saveTrabajador(@ModelAttribute Trabajador trabajador) {
		trabajadorService.save(trabajador);
		
		return "redirect:/skyscrapers/listarTrabajadores";
	}
	
	@GetMapping("/buscarPorIdTrabajador/{id}")
	public String buscarPorIdTrabajador(@PathVariable("id")Integer id, Model model){
		Trabajador trabajador = trabajadorService.buscarPorId(id);
	model.addAttribute("titulo", "Formulario: Editar Trabajador");
	model.addAttribute("trabajador", trabajador);
		return "frmCrearTrabajador";
		}
	
	@GetMapping("/eliminarTrabajador/{id}")
	public String eliminarTrabajador(@PathVariable("id")Integer id) {
		trabajadorService.eliminar(id);
		return "redirect:/skyscrapers/listarTrabajadores";
	}
	
}
