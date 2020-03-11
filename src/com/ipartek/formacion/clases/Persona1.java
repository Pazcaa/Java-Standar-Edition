package com.ipartek.formacion.clases;

public class Persona1 {

	// atributos
	private String nombre;
	private int altura;
	private int edad;
	private String genero;
	private String raza;

	// cosntructores
	public Persona1() {
		super();
		this.nombre = "";
		this.altura = 0;
		this.edad = 0;
		this.genero = "";
		this.raza = "";

	}

	public Persona1(String nombre, int altura, int edad) {
		// super();
		this();
		this.nombre = nombre;
		this.altura = altura;
		this.edad = edad;
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// .toString
	@Override
	public String toString() {
		return "Persona1 [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + ", raza="
				+ raza + "]";
	}

}
