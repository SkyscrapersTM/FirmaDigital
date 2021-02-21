package com.spring.model.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.spring.entity.Documento;

public interface DocumentoService {
public List<Documento> listar();
public int save(Documento d);


}
