package com.spring.model.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.entity.Documento;
import com.spring.model.dao.DocumentoRepository;
import com.spring.model.service.DocumentoService;
@Service
public class DocumentoServicelmpl implements DocumentoService {

	@Autowired
	private DocumentoRepository data;
	@Override
	public List<Documento> listar() {
		 	
		return (List<Documento>)data.findAll();
	}
	@Override
	public int save(Documento d) {
		int res=0;
		Documento documento= data.save(d);
		if(!documento.equals(null)) {
		res=1;
	}
		return res;
	}
	

	
}