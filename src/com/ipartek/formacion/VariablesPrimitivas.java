package com.ipartek.formacion;

public class VariablesPrimitivas {

	public static void main(String[] args) {

		/*
		 * las variables primitivas siempre empiezan por minusculas y tienen un valor
		 * inicial
		 */

		// booleanos
		boolean tienesCoronaVirus = true; // valor por defecto false

		// enteros
		byte bite = 0; // 1byte ==8 bits
		short corto = 0; // 2 bytes
		int entero = 0; // 4 bytes
		long largo = 0; // 8 bytes

		// reales

		float numeroReal = 2f;// es necesario poner una f final o por delante (float)
		double todaviaMasGrande = 6; // no hace falta castera o el tipo

		// caracteres
		char letra = 'a'; // se usa comillas simple
		char letraA = 65;

		/*
		 * Wrapper: son clases que nos ayudan a trabajar con las variables primitivas,
		 * estas empiezan siempre por Mayusculas
		 * 
		 * int => Integer <br> boolean => Boolean <br> char => Character <br> ... <br>
		 * ...<br>
		 */

		System.out.println("un int ocupa " + Integer.SIZE + "bits");
		System.out.println("valor minimo " + Integer.MIN_VALUE + "valor maximo " + Integer.MAX_VALUE);

		String numeroEnFormatoTexto = "23";
		int numero2 = 2;

		int total = numero2 + Integer.parseInt(numeroEnFormatoTexto);
		System.out.println(numero2 + " + " + Integer.parseInt(numeroEnFormatoTexto) + " = " + total);

	}// main

}// clase
