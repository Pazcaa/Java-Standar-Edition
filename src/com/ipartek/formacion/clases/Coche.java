package com.ipartek.formacion.clases;

public class Coche extends Vehiculo {

	private boolean radio;

	public Coche() {
		super(); // esta clase ya viene de vehiculo

		// thi.numeroRuedas = 5; cambiar en vehiculo a 'protected' para que sea visible,
		// pero esta practiva no esta bien
		setNumeroPuertas(5);
		setNumeroRuedas(4);
		this.radio = false;

	}

	public boolean isRadio() { // al booleano no existen get, es un 'is'
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + " Coche [radio=" + radio + "]";
	}

}
