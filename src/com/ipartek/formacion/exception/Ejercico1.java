package com.ipartek.formacion.exception;

import java.util.Scanner;

/*
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego
 * calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la
 * división por cero. Pruebe a introducir b=”Carlos” para ver cómo se comporta
 * el programa. Añada excepciones para recoger estas excepciones y avisar del
 * problema al usuario.
 * 
 *
 */
public class Ejercico1 {

	public static void main(String[] args) {
		//

		int a = 0;
		int b = 1;
		int div = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Dime el valor de a");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("Dime el valor de b");
			b = Integer.parseInt(sc.nextLine());

			div = a / b;
		} catch (ArithmeticException e2) {
			System.out.println("por favor vuelva a ingresar un digito valido");
		} catch (NumberFormatException e) {
			System.out.println("por favor vuelva a ingresar un digito valido");
		} catch (Exception e) {
			System.out.println("excepcion no controlada");
		} finally {
			System.out.println("la division a por b da " + div);
			sc.close();
		}
	}// main
}// class
