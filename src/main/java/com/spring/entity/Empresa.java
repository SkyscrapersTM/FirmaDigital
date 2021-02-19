package com.spring.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idempresa;
	private long ruc;
	private String razon_social;
	private String giro_negocio;
	private String direccion;
	private String correo;
	private int telefono;
	
	public Empresa() {
		
	}
	
	
	
	public Integer getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}
	public long getRuc() {
		return ruc;
	}
	public void setRuc(long ruc) {
		this.ruc = ruc;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getGiro_negocio() {
		return giro_negocio;
	}
	public void setGiro_negocio(String giro_negocio) {
		this.giro_negocio = giro_negocio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	private static final long serialVersionUID = 1L;
}
