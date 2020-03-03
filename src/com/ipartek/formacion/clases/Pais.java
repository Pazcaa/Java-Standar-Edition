package com.ipartek.formacion.clases;

public class Pais {

	// atributos
	private String nombre;
	private int numeroInfectados;

	// cuando se construye un pais su nombre es "" y el numeor de casos es 0

	public Pais() {
		super();
		this.nombre = " ";
		this.numeroInfectados = 0;
	}

	// crear getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}

	// crear .totString
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", numeroInfectados=" + numeroInfectados + "]";
	}

}
