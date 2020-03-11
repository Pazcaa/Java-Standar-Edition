package com.ipartek.formacion.clases.pruebas;

import java.util.Scanner;

import com.ipartek.formacion.clases.Vehiculo;

public class ConfiguradorVehiculo {

	public static void main(String[] args) {
		// preguntar por consola como quiere el vehiculo

//		preguntar color
//		preguntar matricula
//		preguntar puertas y resto de atributos
//		
//		mostrar uno  auno todos los atributos por consola
		Vehiculo v1 = new Vehiculo();
		Scanner sc = new Scanner(System.in);

		System.out.println("A continuacion configurara su vehiculo, porfavor describa las siguientes caracteristicas");
		System.out.println("color: ");
		v1.setColor(sc.nextLine());

		System.out.println("matricula: ");
		v1.setMatricula(sc.nextLine());

		System.out.println("numero de puertas: ");
		v1.setNumeroPuertas(Integer.parseInt(sc.nextLine()));

		System.out.println("numero de ruedas: ");
		v1.setNumeroRuedas(Integer.parseInt(sc.nextLine()));

		System.out.println("potencia: ");
		v1.setPotencia(Float.parseFloat(sc.nextLine()));

		System.out.println("las caracteristicas elegidas son" + v1);

	}// main

}
