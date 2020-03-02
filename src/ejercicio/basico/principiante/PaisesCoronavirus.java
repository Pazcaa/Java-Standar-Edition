package ejercicio.basico.principiante;

public class PaisesCoronavirus {

	public static void main(String[] args) {

		final String[] PAISES = { "Noruega", "Alemania", "Republica Checa", "Italia" };
		boolean[] paisesInfectados = { false, false, false, false };
		int[] numerosInfectados = { 0, 0, 0, 0 };

		// Recorrer paises y preguntar si existe algun caso de coronavirus
		// en caso afirmativo preguntar numero de infectados

		paisesInfectados[1] = true;
		numerosInfectados[1] = 5;

		// Finalmente;
		// 1. mostrar paises libres de coronavirus
		// 2. mostrar paises infectados con su numero de casos
		// 3. mostrar total número de personas infectadas

	}

}
