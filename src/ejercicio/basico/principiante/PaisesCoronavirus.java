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

			if ("si".equalsIgnoreCase(linea)) {
				System.out.println("cuantos casos hay:");

				infectados = Integer.parseInt(sc.nextLine());
				numerosInfectados[i] = infectados;

				total += infectados;

				paisesInfectados[i] = true;

				// paisesInfectados[1] = true;
				// numerosInfectados[1] = 5;

			}

		} // cierre de for

		// Finalmente;
		// 1. mostrar paises libres de coronavirus

		for (int i = 0; i < PAISES.length; i++) {

			if (!paisesInfectados[i]) {// me muestra los paises no infectados
				System.out.println("paises no infectados " + PAISES[i]);
			}
		} // cierre de for

		// 2. mostrar paises infectados con su numero de casos
		for (int i = 0; i < PAISES.length; i++) {
			if (paisesInfectados[i]) {// me muestra los paises infectados
				System.out.println("paises infectados " + PAISES[i] + " con " + numerosInfectados[i] + " personas");
			}
		} // cierre de for

		// 3. mostrar total número de personas infectadas

		System.out.println("numero total de infectados " + total + " personas");

		// 4. mostrar topaises infectados superior a dos personas

		for (int i = 0; i < PAISES.length; i++) {
			if (paisesInfectados[i] && numerosInfectados[i] > 10) {
				System.out.println("paises infectados mayores a 10 personas " + PAISES[i] + " con "
						+ numerosInfectados[i] + " personas");
			}

			else if (paisesInfectados[i] && numerosInfectados[i] > 5) {
				System.out.println("paises infectados mayores a 5 personas " + PAISES[i] + " con "
						+ numerosInfectados[i] + " personas");
			}

			else if (paisesInfectados[i] && numerosInfectados[i] < 5) {
				System.out.println("paises infectados menores a 5 personas " + PAISES[i] + " con "
						+ numerosInfectados[i] + " personas");
			}
		} // for

		sc.close();

	}
}
