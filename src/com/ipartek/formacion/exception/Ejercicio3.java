package com.ipartek.formacion.exception;

import java.util.Scanner;

/*
 * Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada.
 * Llámelo pasando como parámetro  un String sin inicializar. Dicha llamada se encontrara dentro de un bloque 
 * try catch, que en caso de producirse una excepción por un paso de parámetros a null, no acabe con la ejecución del
 * programa. Así mismo, se controlara también que si el numero pasado es mayor que el tamaño del string, capturara el
 * error y nos solicitara meter un numero valido, indicándonos los valores en los que puede estar comprendido (para 
 * este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”). 
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase = "La lluvia en Sevilla no es una maravilla";

		System.out.println(frase);

		boolean error = true;

		do {

			try {
				System.out.println("por favor indica un numero para devolver la letra equivalente");
				int posicion = Integer.parseInt(sc.nextLine());

				if (posicion <= frase.length()) {
					letraDeLaPosicion(frase, posicion);
				} else {
					System.out.println("por favor ingresa un numero inferior o igual a " + frase.length());

				}
				error = false;
			} catch (NullPointerException e) {
			} catch (Exception e) {
				System.out.println("no es un numero valido");
			}

		} while (error);

		System.out.println("tu letra es " + letra);
		sc.close();

	}

	/**
	 * Conseguimos la letra de la posicion indicada de la frase
	 * 
	 * @param frase    String
	 * @param posicion int
	 * @return char letra de la posicion indicada de la frase
	 */

	static char letra;

	static char letraDeLaPosicion(String frase, int posicion) {
		return letra = frase.charAt(posicion);

	}

}// class
