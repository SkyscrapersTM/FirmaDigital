package com.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="documento")
public class Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public int iddocumento;
public String nombre, estado;
public byte[] archivoDoc;

@Temporal(TemporalType.DATE)
@DateTimeFormat(pattern="yyyy-MM-dd")
public Date fechaRegistro;


public Date getFecharegistro() {
	return fechaRegistro;
}
public void setFecharegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}
public byte[] getArchivoDoc() {
	return archivoDoc;
}
public void setArchivoDoc(byte[] archivoDoc) {
	this.archivoDoc = archivoDoc;
}
public int getIddocumento() {
	return iddocumento;
}
public void setIddocumento(int iddocumento) {
	this.iddocumento = iddocumento;
}

public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
