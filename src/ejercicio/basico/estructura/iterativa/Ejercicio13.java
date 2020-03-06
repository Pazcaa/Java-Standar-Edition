package ejercicio.basico.estructura.iterativa;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Programa Java que convierte millas a kilómetros.
		// El programa pide que se introduzca una cantidad de millas y calcula y
		// muestra su equivalente en Kilómetros. El proceso se repite hasta que se
		// introduzca
		// un 0 como valor para las millas.
		// 1 Milla equivale a 1.6093 Kilómetros.
		// El valor de los KM resultantes se debe mostrar con dos decimales.

		float millas;
		float km;
		float x = 1.6093f;
		boolean continuar;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("dime un numero en millas");
			millas = Integer.parseInt(sc.nextLine());

			if (millas == 0) {
				System.out.println("no tienes mas millas por convertir");
				continuar = false;

			} else {

				km = x * millas;

				System.out.println(millas + " equivale a " + km);
				continuar = true;
			}

		} while (continuar);

		sc.close();

		// TODO while (km = millas / x)

	}// main

}// class
