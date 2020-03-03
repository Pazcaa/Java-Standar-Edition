package com.ipartek.formacion.clases;

public class Paises {

	// atributos
	private String nombre;
	private int numeroInfectados;
	private boolean paisesInfectados;

	// constructor
	public Paises() {
		super();
		this.nombre = "";
		this.numeroInfectados = 0;
		this.paisesInfectados = true;
	}

	// gettins and setings

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

	public boolean isPaisesInfectados() {
		return paisesInfectados;
	}

	public void setPaisesInfectados(boolean paisesInfectados) {
		this.paisesInfectados = paisesInfectados;
	}

	// .toString
	@Override
	public String toString() {
		return "Paises [nombre=" + nombre + ", numeroInfectados=" + numeroInfectados + ", paisesInfectados="
				+ paisesInfectados + "]";
	}

}
