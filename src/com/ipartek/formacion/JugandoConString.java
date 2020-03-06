package com.ipartek.formacion;

public class JugandoConString {

	public static void main(String[] args) {

		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		int numeroNumeros = 0;
		int numeroEspacios = 0;

		// contar numeros y espacios en blanco

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			if (Character.isDigit(caracter)) {
				numeroNumeros++;
			}

			if (Character.isSpace(caracter)) {
				numeroEspacios++;
			}

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			// Contar (Vocales o Consonates) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if isLetter

		} // for

		System.out.println("Numero de Numeros " + numeroNumeros);
		System.out.println("Numero de Espacios " + numeroEspacios);
		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);

		// numero de palabras

		String palabras = "hola mi nombre es Ander";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		String lineaCVS = "jose;froilan;16;35.000";
		// mostrar nombre y apellido, la edad y el sueldo anual

		String[] CVS = lineaCVS.split(";");

		// String nombre1;
		String apellido;
		String edad;
		String sueldo;

		// for (int i = 0; i < CVS.length; i++) {

		// nombre1 = CVS[0];
		apellido = CVS[1];
		edad = CVS[2];
		sueldo = CVS[3];

		System.out.println("Nombre completo " + CVS[0] + " " + apellido);
		System.out.println("Edad " + edad + " años");
		System.out.println("Sueldo Anual " + sueldo + " euros");

		// } // for

		// buscar posicion de una letra concreta
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("¿Que pasa si no encuentra? " + buscarLetra.indexOf('z'));
		// buscar primera 'd'
		System.out.println("La primera d esta en la poscion " + buscarLetra.indexOf('d'));

		// buscar posicion ultima 'a'
		System.out.println("La ultima a esta en la poscion " + buscarLetra.lastIndexOf('a'));

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// cambiar numeros por letras y ademas pasar todo a MAYUSCULAS
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		String textoDescodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		textoCodificado = textoCodificado.replace('0', 'o');
		textoCodificado = textoCodificado.replace('1', 'i');
		textoCodificado = textoCodificado.replace('3', 'e');
		textoCodificado = textoCodificado.replace('4', 'a');

		System.out.println(textoCodificado);

		textoDescodificado = textoDescodificado.replace('0', 'o');
		textoDescodificado = textoDescodificado.replace('1', 'i');
		textoDescodificado = textoDescodificado.replace('3', 'e');
		textoDescodificado = textoDescodificado.replace('4', 'a');

		System.out.println(textoDescodificado);

		// TODO sumar todos los numeros de este String
		String dni = "12345678";

		char Letra[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int numerodni = Integer.parseInt(dni);

		int resto = numerodni % 23;

		char letra = Letra[resto];
		System.out.println("tu letra del dni " + Letra[resto]);

		// TODO buscar por interenet como se calcula la letra

	}// main
}// class
