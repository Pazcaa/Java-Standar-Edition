package prueba.ejemplo;

import java.util.Scanner;

/**
 * En este ejercicio se debe crear un array con la altura de 5 personas, para
 * esto se debe pedir los datos por pantalla, una vez obtenidos los datos se
 * debe calcular la media, e indicar la altura mas alta y mas baja
 * 
 * @author Curso
 *
 */

public class EjercicioA {

	public static void main(String[] args) {
		//

		int[] alturas = new int[5];
		int media;// altura media
		int suma = 0;// suma de todas las alturas
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < alturas.length; i++) {
			System.out.println("dime una altura en centimetros");
			int cm = Integer.parseInt(sc.nextLine());
			alturas[i] = cm;

			if (min > cm) {
				min = cm;
			} // if

			if (max > cm) {
				max = cm;
			} // if

			suma += cm;

		} // for

		media = suma / 5;

		System.out.println("las alturas ingresadas son: " + alturas[5]);
		System.out.println("la altura media del grupo es de " + media);

		System.out.println("la altura minima del grupo es de " + min);
		System.out.println("la altura maxima del grupo es de " + max);

		sc.close();

	}// main

}// class
