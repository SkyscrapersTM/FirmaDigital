package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/skyscrapers")
@Controller
public class UsuarioController {
	
	@GetMapping("/home")
	public String Home() {
		return "Index";
	}
	
	@GetMapping("/consultarDocumentos")
	public String ConsultarDocumento() {
		
		return "ConsultarDocumentos";
	}
	
	@GetMapping("/firmarDocumentos")
	public String FirmarDocumento() {
		
		return "FirmarDocumentos";
	}
	
	@GetMapping("/reporteEstadisticos")
	public String ReporteEstadistico() {
		return "ReporteDocumentos";
	}
	
	@GetMapping("/mantenimientoTrabajador")
	public String MantenimientoTrabajador() {
		return "MantenimientoTrabajador";
	}
	
}
