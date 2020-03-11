package com.ipartek.formacion.clases.pruebas;

import com.ipartek.formacion.clases.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {

		// usamos la palabra "new" para crear un objeto o instanciar
		Persona adam = new Persona();

		// no podemos acceder porque los atributos estan encapsulados (privados)
		// adam.nombre = "ADAM";
		// adam.edad = 45;

		adam.setNombre("Adam");
		adam.setEdad(-45);

		System.out.println("Mi nombre es " + adam.getNombre());
		System.out.println("y tengo " + adam.getEdad() + " años");

		Persona eva = new Persona();

		System.out.println("ADAM " + adam); // el syso hace un .toString automatico
		System.out.println("EVA " + eva.toString());

	}

}
