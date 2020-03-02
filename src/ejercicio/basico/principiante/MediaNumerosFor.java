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

public class MediaNumerosFor {

	public static void main(String[] args) {

		String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		Scanner sc = new Scanner(System.in);

		float lunes, martes, miercoles, jueves, viernes, sabado, domingo;
		float media;

		// for (int i = 0; i <= 6; i++) {
		// String dia = diasSemana[i];
		// System.out.println("Dime la temperatura del " + dia);

		System.out.println("Dime la temperatura del lunes");
		lunes = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del martes");
		martes = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del miercoles");
		miercoles = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del jueves");
		jueves = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del viernes");
		viernes = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del sabado");
		sabado = Integer.parseInt(sc.nextLine());

		System.out.println("Dime la temperatura del domingo");
		domingo = Integer.parseInt(sc.nextLine());

		media = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / 7f;

		System.out.println("La temperatura media de la semana es " + media);
		System.out.println();

		sc.close();

	}

}
