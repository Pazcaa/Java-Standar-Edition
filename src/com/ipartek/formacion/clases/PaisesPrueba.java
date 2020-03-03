package com.ipartek.formacion.clases;

public class PaisesPrueba {

	public static void main(String[] args) {

		// crear dos objetos de tipo Pais
		// España con 120 casos
		// Francia con 300 casos

		Pais[] paises = new Pais[2];

		Pais p = new Pais();
		p.setNombre("España");
		p.setNumeroInfectados(120);
		paises[0] = p;

		p = new Pais();
		p.setNombre("Francia");
		p.setNumeroInfectados(300);
		paises[1] = p;

		// mostrar por consola los datos
		// System.out.println(p1.getNombre() + " tiene " + p1.getNumeroInfectados() + "
		// casos");
		// System.out.println(p2.getNombre() + " tiene " + p2.getNumeroInfectados() + "
		// casos");

		// declarar un array con 2 paises inicializados con NULL

		for (int i = 0; i < paises.length; i++) {
			Pais paisActual = paises[i];
			System.out.println(paisActual.getNombre() + " tiene " + paisActual.getNumeroInfectados() + " casos");
		}

	}

}
