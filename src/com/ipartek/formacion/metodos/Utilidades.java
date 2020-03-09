package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	static void saludar(String nombre) {
		System.out.println("Hola  " + nombre);
	}

	/**
	 * Saluda al nombre pasado por parametro en el idioma seleccionado
	 * 
	 * @see idiomas definidos en esta clase, por ejemplo: public static final String
	 *      IDIOMA_CASTELLANO
	 * @param nombre
	 * @param idioma
	 */
	static void saludar(String nombre, String idioma) {

		switch (idioma) {
		case "es":
			System.out.println("Hola  " + nombre);
			break;
		case "eu":
			System.out.println("Kaixo  " + nombre);
			break;
		case "en":
			System.out.println("Hello  " + nombre);
			break;

		default:
			System.out.println("su idioma no es valido");
			break;
		}

	}

	static int suma(int a, int b) {
		return a + b;
	}

	static char calcularLetraDni(int dni) {

		int resto = dni % 23;

		char Letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		return Letra[resto];
	}

	static char calcularLetraDni(String dni) {
		int dni1 = Integer.parseInt(dni);
		int resto1 = dni1 % 23;

		char Letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		return Letra[resto1];

	}

}
