package uf2402;

import java.util.Scanner;

public class PreguntarNumero {

	public static void main(String[] args) {

		System.out.println("dime un numero:");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt(); // lee un numero introducido por el usuario

		System.out.println("has escrito " + numero);

		{

			if (numero % 2 == 0) {
				System.out.println(numero + " " + "es par");

			} else {
				System.out.println(numero + " " + " es impar");
			}

			teclado.close(); // cerramos el teclado

		}

	}
}
