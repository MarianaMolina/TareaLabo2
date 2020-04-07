package com.uca.capas.domain;

public class Usuario {
	private String nombre;
	private String contra;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}
	
	public String getContra() {
		return contra;
	}
	
	public void setContra(String Contra) {
		this.contra = Contra;
	}
	
	public boolean Validacion(String user, String pass ) {
		boolean flag = false;
		if (user == "Mariana" || pass=="Molina") {
			return flag = true;
		}
		else return flag;
	}

}
