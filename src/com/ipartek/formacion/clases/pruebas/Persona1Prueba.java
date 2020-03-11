package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Profesor;

public class Persona1Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] alumnos = new String[3];

		Profesor mat = new Profesor(45000, "matematicas");
		mat.setNombre("Andres");
		mat.setAltura(170);
		mat.setEdad(29);

		Alumno a0 = new Alumno("esteban.or@gmai.com", "esteban", 10);
		a0.setNombre("Esteban");
		Alumno a1 = new Alumno("barbara.or@gmai.com", "barbara", 8);
		a1.setNombre("Barbara");
		Alumno a2 = new Alumno("mauricio.or@gmai.com", "mauricio", 8);
		a2.setNombre("Mauricio");

		for (int i = 0; i < alumnos.length; i++) {

			alumnos[i]={a[i].getNombre,a[i].getEmail(),a[i].getGithub};

		}

	}// main

}
