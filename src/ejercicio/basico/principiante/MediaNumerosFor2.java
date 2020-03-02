package ejercicio.basico.principiante;

import java.util.Scanner;

/**
 * Pedir al usuario la temperatura de los días de la semana, comenzando por el
 * lunes <br>
 * 
 * Mostrar por pantalla la media de la semana y la temperatura min y max de la
 * semana
 *
 */

public class MediaNumerosFor2 {

	public static void main(String[] args) {

		final String[] DIAS_SEMANA = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		Scanner sc = new Scanner(System.in);

		// float lunes, martes, miercoles, jueves, viernes, sabado, domingo;
		float temperaturaDia;
		float media = 0f;
		float minima = Float.MAX_VALUE;
		float maxima = Float.MIN_VALUE;

		for (int i = 0; i < DIAS_SEMANA.length; i++) {
			String dia = DIAS_SEMANA[i];
			System.out.println("Dime la temperatura del " + dia);

			temperaturaDia = Float.parseFloat(sc.nextLine());
			media += temperaturaDia; // me suma todas las temperaturas

			if (minima > temperaturaDia) {
				minima = temperaturaDia;
			}

			if (maxima < temperaturaDia) {

				maxima = temperaturaDia;
			}

		}

		// media = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) /
		// 7f;

		System.out.println("La temperatura media de la semana es " + (media / 7));
		System.out.println(" la minima es " + minima + "ºC");
		System.out.println(" la maxima es " + maxima + "ºC");

		sc.close();

	}

}
