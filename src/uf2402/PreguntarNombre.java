package uf2402;

import java.util.Scanner;

public class PreguntarNombre {

	public static void main(String[] args) {

		System.out.println("dime tu nombre:");

		Scanner teclado = new Scanner(System.in);

		String nombre = teclado.next(); // lee un nombre introducido por el usuario

		System.out.println("dime tu 1º apellido:");

		String apellido1 = teclado.next();

		System.out.println("dime tu 2º apellido:");

		String apellido2 = teclado.next();

		System.out.println("tu nombre completo es: " + " " + nombre + " " + apellido1 + " " + apellido2);
		{

			teclado.close(); // cerramos el teclado
		}

	}

}
