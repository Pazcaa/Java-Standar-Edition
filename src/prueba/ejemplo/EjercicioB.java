package prueba.ejemplo;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menu con tres opciones:
 * 1. Calcular la letra del DNI 2. Calcular medidadas de ºC a ºF 3. opcion salir
 * del menu
 * 
 * @author Curso
 *
 */
public class EjercicioB {

	static Scanner sc;
	static boolean continuar;

	public static void main(String[] args) {
		//

		int opcion;
		sc = new Scanner(System.in);

		System.out.println("Tienes un menu con tres opciones");
		System.out.println("1. Calcular letra del DNI");
		System.out.println("2. Convertir un numero en metros a pies");
		System.out.println("3. Salir del menu");
		do {

			System.out.println("Por favor escribe tu opcion");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				// calcular la letra del DNI
				calcularDNI();

				break;

			case 2:
				// convertir metros a pies
				convertirMetrosPies();

				break;

			case 3:
				// Salir del programa

				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("por favor elige una opcion valida (del 1 al 3)");

				break;
			}// switch
		} while (continuar);

		sc.close();
	}// main

	private static void calcularDNI() {
		//
		System.out.println("Eliges calcular tu letra del DNI");
		System.out.println("porfavor escribe tu dni");
		int dni = Integer.parseInt(sc.nextLine());

		char Letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		int resto = dni % 23;

		System.out.println("Tu letra del DNI es " + Letra[resto]);
		continuar = true;
		// System.out.println("Hasta pronto");

	}// metodo calcularDNI

	private static void convertirMetrosPies() {
		//
		System.out.println("Eliges convertir un numero en metros a pies");
		System.out.println("Por favor ingresa un numero");
		float metro = Integer.parseInt(sc.nextLine());

		float conversor = 3.2808f;

		float pies = conversor * metro;

		System.out.println(metro + "metros equivalen a " + pies);
		continuar = true;

	}// metodo convertirMetrosPies

}// class
