package com.ipartek.formacion.metodos;

public class Utilidades {

	public static final String IDIOMA_CASTELLANO = "es";
	public static final String IDIOMA_EUSKERA = "eu";
	public static final String IDIOMA_INGLES = "en";

	private static final char LETRA[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
			'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

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
	 * @throws Exception
	 */
	static String saludar(String nombre, String idioma) throws Exception {
		// si es void el retorno, no hay return
		String saludo = "";
		switch (idioma) {
		case IDIOMA_CASTELLANO:
			saludo = "Hola " + nombre;
			break;
		case IDIOMA_EUSKERA:
			saludo = "Kaixo " + nombre;
			break;
		case IDIOMA_INGLES:
			saludo = "Hello " + nombre;
			break;

		default:
			throw new Exception("su idioma no es valido " + idioma);

		}
		return saludo;

	}

	static int suma(int a, int b) {
		return a + b;
	}

	// sobrecarga (no es sobre-escritura)
	// sobrecarga es el mismo nombre de metodo o funcion, mismo reetorno, pero
	// diferentes parametros
	static char calcularLetraDni(int dni) throws Exception {
		String sDni = String.valueOf(dni);
		return calcularLetraDni(sDni);
	}

	// DRY Dont repeat Yourself

	static char calcularLetraDni(String dni) throws Exception {
		char letra = ' ';
		int dni1 = 0;
		if (dni != null && dni.length() == 8) {
			dni1 = Integer.parseInt(dni);
			int resto = dni1 % 23;
			letra = LETRA[resto];
		} else {
			throw new Exception("No es un DNI valido " + dni);
		}
		return letra;
	}

	static int[] bubbleShort(int[] aDesordenado) {

		int[] aOrdenado = aDesordenado;
		int aux = 0;

		for (int i = 0; i < aOrdenado.length; i++) {
			for (int j = 0; j < (aOrdenado.length - 1); j++) {

				if (aOrdenado[j] > aOrdenado[j + 1]) {

					aux = aOrdenado[j];
					aOrdenado[j] = aOrdenado[j + 1];
					aOrdenado[j + 1] = aux;
				}

			}

		}

		return aOrdenado;
	}

}
