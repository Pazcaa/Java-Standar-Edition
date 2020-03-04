package ejercicio.basico.estructura.iterativa;

public class Ejercicio1 {

	public static void main(String[] args) {
		// @see
		// http://puntocomnoesunlenguaje.blogspot.com/2012/10/estructura-repetitiva-en-java-1.html

		// 1. Ejemplo de uso de while:
		// Programa Java que muestre los números del 1 al 100 utilizando la instrucción
		// while.

		System.out.println("Numeros del 1 al 100: ");
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;

		}

		// Ejemplo de uso de do-while.
		// Programa Java que muestre los números del 1 al 100 utilizando la instrucción
		// do..while.

		System.out.println("Numeros del 1 al 100: ");

		int x = 1;

		do {
			System.out.println(x);
			x++;

		} while (x <= 100);

		// 3. Ejemplo de uso de for.
		// Programa Java que muestre los números del 1 al 100 utilizando la instrucción
		// for.

		int y;

		for (y = 1; y <= 100; y++)
			;
		System.out.println(y);

	}// main

}
