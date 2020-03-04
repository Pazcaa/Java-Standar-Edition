package ejercicio.basico.condicional;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// @see
		// http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-basicos-resueltos.html

		// Ejercicio 4: Programa que lea dos caracteres y compruebe si son iguales.

		String A;
		String B;

		Scanner sc = new Scanner(System.in);

		System.out.println("dime una letra");
		A = sc.nextLine();

		System.out.println("dime otra letra");
		B = sc.nextLine();

		if (A.equals(B)) { // me ayuda a comparar dos objetos
			System.out.println("ambas letras son iguales");
		} else {
			System.out.println(A + " y " + B + " no son las mismas letras.");
		}

		// Ejercicio 5: Programa java que lea dos caracteres por teclado y
		// compruebe si los dos son letras minúsculas

		char C;
		char D;

		System.out.println("dime una letra");
		C = sc.next();

		System.out.println("dime otra letra");
		D = sc.next();

		if (Character.isLowerCase(C) && Character.isLowerCase(D)) {
			System.out.println("ambas letras son minusculas");

		}

		sc.close();

	}

}
