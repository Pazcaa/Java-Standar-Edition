package ejercicio.basico.condicional;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// @see
		// http://puntocomnoesunlenguaje.blogspot.com/2012/07/java-ejercicios-basicos-condicional-1.html

		// 1. Programa Java que lea un número entero por teclado y calcule si es par o
		// impar.

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("dime un numero");
		numero = Integer.parseInt(sc.nextLine());

		if (numero % 2 == 0) {
			System.out.println(numero + " es numero par");
		} else {
			System.out.println(numero + " es un numero impar ");
		}

		// 2. Programa que lea un número entero
		// y muestre si el número es múltiplo de 10.

		if (numero % 10 == 0) {
			System.out.println(numero + " es multiplo de 10");
		} else {
			System.out.println(numero + " no es multiplo de 10");

		}

		// Programa que lea un carácter por teclado y compruebe si es una letra
		// mayúscula

		char letra;

		System.out.println("dime una letra");
		letra = (char) sc.read();

		if (Character.isUpperCase(letra)) {
			System.out.println(letra + "es mayuscula");
		} else {
			System.out.println(letra + "es minuscula");
		}

		sc.close();
	}
}
