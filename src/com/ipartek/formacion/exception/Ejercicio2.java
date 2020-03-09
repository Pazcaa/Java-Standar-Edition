package com.ipartek.formacion.exception;

import java.util.Scanner;

/*
 * Realice un programa que nos solicite por teclado dos n�meros, y leerlos usando la clase Scanner mediante la 
 * funci�n nextLine(). Transformar ambos strings a n�meros enteros usando la siguiente sentencia 
 * Integer.parseInt(numeroLeido). Agrupar el c�digo entre un bloque try catch y procesar para que no se produzca una
 * interrupci�n y finalizaci�n del programa si alguno de los n�meros le�dos no puede convertirse, retomando el
 * control en el punto del fallo, hasta que se solucione.
 * 
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		boolean error = true;

		Scanner sc = new Scanner(System.in);

		do {

			try {
				System.out.println("dime un numero");
				a = Integer.parseInt(sc.nextLine());

				System.out.println("dime otro numero");
				b = Integer.parseInt(sc.nextLine());

				error = false;
			} catch (Exception e) {
				System.out.println("ingresa dos numero validos porfavor");
			}

		} while (error);

		System.out.println("tus numeros son " + a + " y " + b);

		sc.close();
	}// main

}// class
