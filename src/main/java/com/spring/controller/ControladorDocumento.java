package com.spring.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.String;
import java.text.SimpleDateFormat;

import com.spring.entity.Documento;
import com.spring.model.service.DocumentoService;
import com.spring.model.service.UploadFileService;


@Controller
@RequestMapping
public class ControladorDocumento {
@Autowired
private DocumentoService service;

@Autowired
private UploadFileService uploadFileService;
@GetMapping("/skyscrapers/subirDocumento")
public String listar(Model model) {
	List<Documento>documentos=service.listar();
	model.addAttribute("documentos", documentos);
	return "SubirDocumento";
}

@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("documento", new Documento());
	return "Agregar";
	}
@PostMapping("/save")

	public String save(@Validated Documento d, Model model) {
		service.save(d);
		return "redirect:/SubirDocumento";
	}

String pattern = "yyyy-MM-dd";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);


@PostMapping("/upload")
public String uploadFile(@RequestParam("archivoDoc") MultipartFile file,
RedirectAttributes ra ) throws IOException{
    String filename=StringUtils.cleanPath(file.getOriginalFilename());
    Documento documento= new Documento();
    documento.setNombre(filename);
    documento.setArchivoDoc(file.getBytes());
    documento.setEstado("Pendiente");
    documento.setFecharegistro(new Date());
    service.save(documento);
   return "redirect:skyscrapers/subirDocumento/";
    }
  
}

	