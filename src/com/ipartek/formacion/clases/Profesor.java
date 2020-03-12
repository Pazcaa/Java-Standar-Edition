package com.ipartek.formacion.clases;

public class Profesor extends Persona1 {
	// atributos propios de profesor
	private float sueldo;
	private String materia;

	// constructor propio de profesor
	public Profesor() {
		super();// llama a Persona1
		this.sueldo = 2000;
		this.materia = "";
	}

	public Profesor(float sueldo, String materia) {
		// super();
		this();
		this.sueldo = sueldo;
		this.materia = materia;
	}

//getters and setters
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}
