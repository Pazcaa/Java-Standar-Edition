package uf2402;

/*
 * esto es un comentario de bloque
 * podemos escribir varias lineas de codigo
 */

/**
 * JavaDoc es para documentar el codigo fuente o src
 * 
 * @author Curso
 */
public class HolaMundo {
	// las Clases empiezan con mayusculas y camel case
	// las variables empiezan con minusculas y pascal case
// todo nuestro codigo a ejecutar debe estar dentro del MAIN 
	public static void main(String[] args) {

		// String es el tipo de variable
		// persona: nombre de la variable
		// "Ander"= es el valor que le asignamos a la variable

		String persona = "Ander";
		int edad = 39;// sirve para numeros enteros
		float altura = 1.70f;// hay que poner una f al final o (float) por delante
		// float otraAltura = (float) 1.70;
		boolean isGoodDay = false;

		// usamos el operador + para concatenar String o cadenas de texto
		System.out.println("Mi nombre es " + persona);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " metros");

		if (isGoodDay) {
			System.out.println("Hoy tengo un día bueno");
		} else {
			System.out.println("Hoy es un día de malo");
		}

	} // Final metodo main

} // Final de la clase
