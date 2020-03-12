package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Alumno;
import com.ipartek.formacion.clases.Profesor;

public class Persona1Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor mat = new Profesor(45000, "matematicas");
		mat.setNombre("Andres");
		mat.setAltura(170);
		mat.setEdad(29);

		Alumno[] alumnos = new Alumno[3];

		Alumno a1 = new Alumno("esteban.or@gmai.com", "esteban", 10);
		a1.setNombre("jaimito");
		a1.setGenero('f');

		Alumno a2 = new Alumno("barbara.or@gmai.com", "barbara", 8);
		a2.setNombre("jaimita");
		a2.setGenero('m');

		Alumno a3 = new Alumno("mauricio.or@gmai.com", "mauricio", 5);
		a3.setNombre("hodei");
		a3.setGenero('i');

		alumnos[0] = a1;
		alumnos[1] = a2;
		alumnos[2] = a3;

		System.out.println("El profesor " + mat.getNombre() + "imparte la materia de: " + mat.getMateria());
		System.out.println("Sus alumnos son: ");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " nota: " + alumno.getNota());
		}

		// TODO mostrar Alumno con nota maxima
		// TODO mostrar alumno con nota min
		Alumno alumnoNotamAx = new Alumno();
		Alumno alumnoNotaMin = new Alumno();
		int min = Alumno.NOTA_MAX;
		String nombreMin = "";
		int max = Alumno.NOTA_MIN;
		String nombreMax = "";
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = alumnos[i];
			if (min > alumnos[i].getNota()) {
				min = alumnos[i].getNota();
				// nombreMin = alumnos[i].getNombre();
				alumnoNotaMin = alumno;
			}

			if (max < alumnos[i].getNota()) {
				max = alumnos[i].getNota();
				// nombreMax = alumnos[i].getNombre();
				alumnoNotamAx = alumno;
			}

		} // for

		System.out.println("La nota minima del grupo es: " + alumnoNotaMin.getNota() + " y corresponde a "
				+ alumnoNotaMin.getNombre());
		System.out.println("La nota maxima del grupo es: " + alumnoNotamAx.getNota() + " y corresponde a "
				+ alumnoNotamAx.getNombre());

	}// main

}
