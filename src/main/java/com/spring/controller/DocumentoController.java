package com.spring.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.DocumentoII;
import com.spring.entity.DocumentoReporte;
import com.spring.model.dao.DocumentoDAO;

@RequestMapping("/skyscrapers")
@Controller
public class DocumentoController {

	@Autowired
	DocumentoDAO documentoDAO;
	
	@GetMapping("/documentos/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<DocumentoII> listDocuments = documentoDAO.findAll();
         
        DocumentoReporte excelExporter = new DocumentoReporte(listDocuments);
         
        excelExporter.export(response);    
    } 
}
