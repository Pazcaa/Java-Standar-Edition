package prueba;

import java.util.Scanner;

/**
 * A) Realizar un programa en java que realice la siguiente función: Crear un
 * array de 5 notas que almacenara en formato double. Una vez creado dicho array
 * se rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * @author Paz Caamaño Barrera
 *
 */
public class UF2404EjercicioA {

	public static void main(String[] args) {

		// declarar variables: arraysNotas, media, maxima, minima
		double[] notas = new double[5];
		double media;// nota media
		double suma = 0;// suma de todas las notas
		double min = Integer.MAX_VALUE; // me indica la nota minima del array
		double max = Integer.MIN_VALUE; // me indica la nota maxima del array
		double nota = 0;// nota inicial para verificar error al ingresar numeros
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {

			System.out.println("Dime tu nota porfavor");
			nota = -1;// para cuando ingresan notas no validas

			do {

				try {
					nota = Double.parseDouble(sc.nextLine());// me convierte el numero ingresado a double
				} catch (Exception e) {
					System.out.println("lo sentimos pero no es una nota, escribe un numero");
				}

			} while (nota == -1);

			notas[i] = nota;
			suma += nota;

			if (min > nota) {// para fijar la nota minima
				min = nota;
			} // if

			if (max < nota) {// para fijar la nota maxima
				max = nota;
			} // if

		} // for

		media = suma / notas.length;// me calcula la nota media del array

		System.out.println("Tus notas ingresadas son: " + notas[0] + ", " + notas[1] + ", " + notas[2] + ", " + notas[3]
				+ " y " + notas[4]);
		System.out.println("Tu nota media es " + media);
		System.out.println("Tu nota minima es " + min);
		System.out.println("Tu nota maxima es " + max);

		sc.close();// cerra scanner
	}// main

}// class
