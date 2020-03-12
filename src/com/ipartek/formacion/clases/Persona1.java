package com.ipartek.formacion.clases;

public class Persona1 {

	public static final char GENERO_FEMENINO = 'f';
	public static final char GENERO_MASCULINO = 'm';
	public static final char GENERO_INDEFINIDO = 'i';

	// atributos
	private String nombre;
	private int altura; // en centimetros
	private int edad;
	private char genero;
	private String raza;

	// cosntructores
	public Persona1() {
		super();
		this.nombre = "anonimo";
		this.altura = 0;
		this.edad = 0;
		this.genero = GENERO_INDEFINIDO;
		this.raza = "";

	}

	public Persona1(String nombre, char genero) {
		this();
		this.nombre = nombre;
		this.genero = genero;
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
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
