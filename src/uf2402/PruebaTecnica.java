package uf2402;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("Prueba Técnica");

		System.out.println("**Empezamos el bucle");

		for (int i = 0; i < 5; i++) {

			if (i == 0) {
				System.out.println(i + "es cero");

			} else {

				if (i % 2 == 0) {
					System.out.println(i + "es par");

				} else {
					System.out.println(i + "es impar");
				}
			}

			// ystem.out.println("Esta es la iteración numero " + i);

		} // for

		System.out.println("**Terminamos el bucle");

	}// main

}
