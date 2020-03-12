package prueba;

import java.util.Scanner;

public class UF2404CochePrueba {

	public static void main(String[] args) {
		int numeroCoches = 0;

		int respuesta = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Porfavor indique los datos de su coche para rellenar su ficha");
		System.out.println("¿cuantos coches desea ingresar?");
		numeroCoches = Integer.parseInt(sc.nextLine());
		Coche[] coches = new Coche[numeroCoches]; // Array que guardare mis nuevos coches
		int contador = 0;

		do {
			contador = contador;
			Coche coche = new Coche();
			System.out.println("Si desea ingresar sus datos porfavor escriba 1, en caso contrario escriba 2");
			respuesta = Integer.parseInt(sc.nextLine());

			switch (respuesta) {

			case 1:
				System.out.println("Porfavor indique la matricula");
				coche.setMatricula(sc.nextLine());

				System.out.println("Porfavor indique la marca");
				coche.setMarca(sc.nextLine());

				System.out.println("Porfavor indique la modelo");
				coche.setModelo(sc.nextLine());

				System.out.println("Porfavor indique la color");
				coche.setColor(sc.nextLine());

				System.out.println("Porfavor indique la potencia");
				coche.setPotencia(Float.parseFloat(sc.nextLine()));

				System.out.println("Porfavor indique la cilindrada");
				coche.setCilindrada(Float.parseFloat(sc.nextLine()));

				coches[contador] = coche;

				contador++;
				break;

			case 2:
				System.out.println("no se ingresaran los datos del coche ");
				coches[contador] = coche;
				contador++;
				break;
			default:
				System.out.println("esa opcion no es valida, porfavor vuelva a escribir su opcion");
				if (contador == 0) {
					contador = 0;
				} else {
					contador = (contador - 1);
				}

				break;

			}
		} while (contador != coches.length);

//		for (int i = 0; i < coches.length; i++) {
//			Coche coche = new Coche();
//			System.out.println("Si desea ingresar sus datos porfavor escriba 1, en caso contrario escriba 2");
//			respuesta = Integer.parseInt(sc.nextLine());
//
//			switch (respuesta) {
//
//			case 1:
//				System.out.println("Porfavor indique la matricula");
//				coche.setMatricula(sc.nextLine());
//
//				System.out.println("Porfavor indique la marca");
//				coche.setMarca(sc.nextLine());
//
//				System.out.println("Porfavor indique la modelo");
//				coche.setModelo(sc.nextLine());
//
//				System.out.println("Porfavor indique la color");
//				coche.setColor(sc.nextLine());
//
//				System.out.println("Porfavor indique la potencia");
//				coche.setPotencia(Float.parseFloat(sc.nextLine()));
//
//				System.out.println("Porfavor indique la cilindrada");
//				coche.setCilindrada(Float.parseFloat(sc.nextLine()));
//
//				coches[i] = coche;
//				break;
//
//			case 2:
//				System.out.println("no se ingresaran los datos del coche " + (i + 1));
//				coches[i] = coche;
//				break;
//			default:
//				System.out.println("esa opcion no es valida, porfavor vuelva a escribir su opcion");
//				break;
//			}
//
//		} // for

		System.out.println("sus coches y caracteristicas ingresadas son las siguientes: ");
		for (int i = 0; i < coches.length; i++) {
			System.out.println(coches[i]);
		}

		sc.close();

	}// main
}// class
