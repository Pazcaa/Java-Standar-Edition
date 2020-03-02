package ejercicio.basico.principiante;

import java.util.Scanner;

public class PaisesCoronavirus {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Republica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numerosInfectados = { 0, 0, 0, 0 };
		int infectados;
		int total = 0; // numero total de infectados

		Scanner sc = new Scanner(System.in);

		// Recorrer paises y preguntar si existe algun caso de coronavirus
		// en caso afirmativo preguntar numero de infectados

		for (int i = 0; i < PAISES.length; i++) {
			String pais = PAISES[i];
			System.out.println("Nombre del pais " + pais);
			System.out.println("Si existe un algun caso de coronavirus escribir si");
			String linea = sc.nextLine();

			if (linea.equalsIgnoreCase("si")) {
				System.out.println("cuantos casos hay:");

				infectados = Integer.parseInt(sc.nextLine());
				numerosInfectados[i] = infectados;

				total += infectados;

				paisesInfectados[i] = true;

				// paisesInfectados[1] = true;
				// numerosInfectados[1] = 5;

			}

		}
		// Finalmente;
		// 1. mostrar paises libres de coronavirus
		// 2. mostrar paises infectados con su numero de casos
		// 3. mostrar total número de personas infectadas

		// System.out.println("paises sin coronavirus" + );
		// System.out.println("paises infectados" + );
		System.out.println("numero total de infectados " + total + " personas");

		sc.close();

	}
}
