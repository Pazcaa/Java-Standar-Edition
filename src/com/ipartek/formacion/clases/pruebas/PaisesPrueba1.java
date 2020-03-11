package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Paises;

public class PaisesPrueba1 {

	public static void main(String[] args) {

		Paises[] pais = new Paises[4];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < pais.length; i++) {
			Paises p = new Paises();
			System.out.println("dime el nombre del país ");
			String a = sc.nextLine();
			p.setNombre(a);

			System.out.println("¿existe algun caso de Coronavirus? Escribir si o no ");
			String resp = sc.nextLine();

			if ("si".equalsIgnoreCase(resp)) {
				System.out.println("cuantos casos hay:");
				int n = Integer.parseInt(sc.nextLine());
				p.setNumeroInfectados(n);

				// p.isPaisesInfectados();s

			}

			pais[i] = p;

		} // for

		sc.close();
	}

}
