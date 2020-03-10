package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];

		float diferencia = 0;

		diferencia = entregado - importe;

		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

			if (diferencia > BILLETES_MONEDAS[i]) {

				float resto = (diferencia / BILLETES_MONEDAS[i]);
				int vuelto = Float.floatToIntBits(resto);
				vueltas[i] = vuelto;

				diferencia = diferencia - vuelto;
			}

		} // for

		// TODO vuestro marron

		return vueltas;

	}// exception vueltas optimas

	public static float calcularVueltas(float importe, float entregado) throws Exception {
		// TODO vuestro marron

		float dif = 0;
		if (importe < entregado) {
			dif = entregado - importe;

		} else {
			throw new Exception("El importe es mayor a lo entregado");

		}
		return dif;
	}// exception vueltas
}// class
