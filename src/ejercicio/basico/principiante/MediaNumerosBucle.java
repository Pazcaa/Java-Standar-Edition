package ejercicio.basico.principiante;

import java.util.Scanner;

/**
 * Ejercicio para pedir 3 numeros por pantalla y sacar la media
 *
 */

public class MediaNumerosBucle {

	public static void main(String[] args) {

		boolean terminar = true;
		float numero, total = 0;
		float contador = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Dime un numero");
			numero = Float.parseFloat(sc.nextLine());
			// total = total + numero;
			total += numero;

			// preguntar si se quiere terminar
			System.out.println("¿Quieres terminar? escribe si");
			String linea = sc.nextLine();
			if (linea.equalsIgnoreCase("si")) {// de esta manera da igual mayuscula o minuscula
				terminar = false;
			}

			// contador = contador + 1;
			contador++;

		} while (terminar);

		System.out.println("El total es: " + total);
		System.out.println("La media es " + (total / contador));

		sc.close();

	}

}
