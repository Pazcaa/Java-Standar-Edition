package prueba;

import java.util.Scanner;

/**
 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ol>
 * <li>• Calcular la letra del dni</li>
 * <li>• Calcular medida de cm a pulgadas</li>
 * <li>• Salir</li>
 * </ol>
 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
 * usuario escoge cada una de las funciones, que permita introducir los datos
 * correspondientes por teclado para poder dar el resultado
 * 
 * @author Paz Caamaño Barrera
 *
 */
public class UF2404EjercicioB {

	static Scanner sc;
	static boolean continuar;

	public static void main(String[] args) {

		int opcion;
		sc = new Scanner(System.in);

		System.out.println("Tienes un menu con tres opciones");
		System.out.println("1. Calcular letra del DNI");
		System.out.println("2. Calcular medida de cm a pulgadas");
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
				// convertir de cm a pulgadas
				convertirCmPulgadas();

				break;

			case 3:
				// Salir del programa
				System.out.println("Eliges salir del menu");
				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("por favor elige una opcion valida (del 1 al 3)");

				break;
			}// switch
		} while (continuar);

		sc.close();// cerrar scanner

	}// main

	private static void calcularDNI() {
		// opcion 1
		System.out.println("Eliges calcular tu letra del DNI");
		System.out.println("porfavor escribe tu dni");
		int dni = Integer.parseInt(sc.nextLine()); // transforma el numero del dni en un solo numero entero

		char Letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };// array de las letras del dni

		int resto = dni % 23;// me da el resto de la division del numero del dni en 23 (numero de letras)

		System.out.println("Tu letra del DNI es " + Letra[resto]); // te indica la letra que le corresponde al numero
																	// del dni
		continuar = true;

	}// metodo calcularDNI

	private static void convertirCmPulgadas() {
		// opcion 2
		System.out.println("Eliges convertir medidas en cm a pulgadas");
		System.out.println("porfavor escribe tu medida");
		float cm = Float.parseFloat(sc.nextLine());

		float aux = 0.394f;

		float pulgadas = cm + aux;

		System.out.println("Tus " + cm + " cm equivalen a " + pulgadas + " pulgadas");
		continuar = true;

	}// metodo convertirCmPulgadas

}// class
