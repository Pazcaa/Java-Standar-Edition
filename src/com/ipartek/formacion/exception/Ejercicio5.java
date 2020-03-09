package com.ipartek.formacion.exception;

/*
 * Realizar un programa que lance un número aleatorio del 1 al 6. Según el número sacado, se lanzara una excepción u
 * otra de la siguiente lista:
 *	1: ArithmeticException
 *	2: NullpointerException
 *	3: NumberFormatException
 *	4: SecurityException
 *	5: NegativeArrayException
 *	6: IOException
 *Haciendo uso del try y del catch, mostrar un mensaje por pantalla y explicar cuál es la excepción ocurrida. 
 *Repetir este proceso de manera indefinida, controlando dichas excepciones y sin dar pie a que el programa se 
 *cuelgue
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		int numero = 0;
		int resultado;

		try {

			switch (numero) {
			case 1:// aritmetic exception
				resultado = 6 / 0;
				break;
			case 2:// null pointer exception

				break;
			case 3:// NumberFormatException

				break;
			case 4:// SecurityException

				break;
			case 5:// NegativeArrayException

				break;
			case 6:// IOException

				break;

			default:
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
