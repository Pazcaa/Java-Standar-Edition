package ejercicio.basico.condicional;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// @see
		// http://puntocomnoesunlenguaje.blogspot.com/2012/10/java-ejercicios-basicos-condicional-4.html

		// variables
		int mes;
		// int dia1 = 28;
		// int dia2 = 30;
		// int dia3 = 31;
		final String[] MES = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		Scanner sc = new Scanner(System.in); // para leer por pantalla

		System.out.println("Dime un mes del 1 al 12");
		mes = Integer.parseInt(sc.nextLine());

		if (mes >= 1 && mes <= 12) {
			System.out.println("es un mes valido");
		} else {
			System.out.println("ese mes no existe");
		}

		for (int i = 0; i < MES.length; i++) {

			if (mes == i) {
				System.out.println(" tu mes es " + MES[i]);
			}
		}

		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("es un mes de 30 días");
		}
		if (mes == 2) {
			System.out.println("es un mes de 28 días");
		} else {
			System.out.println("es un mes de 31 días");
		}

		sc.close();

	}

}
