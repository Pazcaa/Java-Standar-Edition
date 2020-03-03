package com.ipartek.formacion.clases;

public class Persona {

	// atributos, siempre son "private" para que no se puedan manipular desde fuera
	// de esta clase,
	// para poder manipuar los atributos hay que crear los metodos "publicos"
	// denominados
	// getters y setters. Ha esto se le llama "encapsulación".
	// (source=>generate getters and setters())
	private String nombre;
	private int edad;

	// constructor porque se llama igual que la clase (source=> generate constructor
	// from superclass)
	public Persona() {
		super();
		this.nombre = "anonimo";
		this.edad = 18;

	}

	// getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			this.edad = 0;
		} else
			this.edad = edad;
	}

//funcion que devuelve un string que es publico (source=>generate to string())
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
