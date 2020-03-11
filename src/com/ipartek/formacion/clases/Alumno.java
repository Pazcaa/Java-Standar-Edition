package com.ipartek.formacion.clases;

public class Alumno extends Persona1 {

	// atributos
	private String email;
	private String github;
	private int nota;

	// constructor
	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 0;

	}

	public Alumno(String email, String github, int nota) {
		// super();
		this();
		this.email = email;
		this.github = github;
		this.nota = nota;
	}

//getters and setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	// .toString
	@Override
	public String toString() {
		return super.toString() + "Alumno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}
