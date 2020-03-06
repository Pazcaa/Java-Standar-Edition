package ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * @see http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejercicio1 = Calcular la media de una serie de números que se leen por
		// teclado.
		// Programa Java que lea por teclado 10 números enteros y los guarde en un
		// array.
		// A continuación calcula y muestra por separado la media de los valores
		// positivos y la de los valores
		// negativos.

		int[] numeros = new int[10];
		int total = 0;
		int pos = 0;
		int neg = 0;
		int media = 0;
		int positivos = 0;
		int negativos = 0;
		int mediapos = 0;
		int medianeg = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("por favor dime un numero");
			int numero = Integer.parseInt(sc.nextLine());

			numeros[i] = numero;
			total += numero;

			if (numero > 0) {
				positivos += numero;
				pos++;

			} else {
				negativos += numero;
				neg++;
			}

		} // for

		media = total / numeros.length;
		mediapos = positivos / pos;
		medianeg = negativos / neg;
		System.out.println("Tus numeros son: " + numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3]
				+ " " + numeros[4] + " " + numeros[5] + " " + numeros[6] + " " + numeros[7] + " " + numeros[8] + " "
				+ numeros[9]);
		System.out.println(" la media de los numeros positivos son: " + mediapos);
		System.out.println(" la media de los numeros negativos son: " + medianeg);

		// 2. Programa Java que lea 10 números enteros por teclado y los guarde en un
		// array.
		// Calcula y muestra la media de los números que estén en las posiciones pares
		// del array

		int[] numeros2 = new int[10];
		int par = 0;
		int p = 0;
		int impar = 0;
		int imp = 0;

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Dime un numero");
			int numero = Integer.parseInt(sc.nextLine());
			numeros2[i] = numero;

			if (i % 2 == 0) {
				par += numero;
				p++;
			} else {
				impar += numero;
				imp++;

			}
		} // for

		int mediap = par / p;
		int mediaimp = impar / imp;

		System.out.println("tu media de los numeros que estan en posicion par es de: " + mediap);
		System.out.println("tu media de los numeros que estan en posicion impar es de: " + mediaimp);

	}// main

}// class
