package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class UF2404CocheArrayList {

	public static void main(String[] args) {
		//int numeroCoches = 0;

		int respuesta = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Porfavor indique los datos de su coche para rellenar su ficha");
		//System.out.println("¿cuantos coches desea ingresar?");
		//numeroCoches = Integer.parseInt(sc.nextLine());
		ArrayList<Coche> coches = new ArrayList<>();//Array list que guarda mis nuevos coches
		//Coche[] coches = new Coche[numeroCoches]; // Array que guardare mis nuevos coches
		//int contador = 0;
		boolean contador = true;

		do {
			//contador = contador;
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

				//coches[contador] = coche;
				coches.add(coche);
				//contador++;
				break;

			case 2:
				System.out.println("no se ingresaran los datos del coche ");
				//coches[contador] = coche;
				//contador++;
				contador = false;
				break;
			default:
				System.out.println("esa opcion no es valida, porfavor vuelva a escribir su opcion");
//				if (contador == 0) {
//					contador = 0;
//				} else {
//					contador = (contador - 1);
//				}
				contador = true;

				break;

			}
		} while (contador);



		System.out.println("sus coches y caracteristicas ingresadas son las siguientes: ");
		for (Coche c : coches) {
			System.out.println(c);
		}

		sc.close();


	}

}
