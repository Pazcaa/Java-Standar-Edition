package com.ipartek.formacion.metodos;

public class Vueltas {

	public static final float[] BILLETES_MONEDAS = { 500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f,
			0.05f, 0.02f, 0.01f };

	public static int[] calcularVueltasOptimas(float importe, float entregado) throws Exception {

		int[] vueltas = new int[BILLETES_MONEDAS.length];

		float diferencia = entregado - importe;

		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {

			if (diferencia > 0) {
				float resto = diferencia / BILLETES_MONEDAS[i];
				vueltas[i] = (int) resto;

				diferencia = diferencia - (BILLETES_MONEDAS[i] * vueltas[i]);
			}
			if (entregado == importe) {
				float resto = entregado / BILLETES_MONEDAS[i];
				vueltas[i] = (int) resto;

				entregado = entregado - (BILLETES_MONEDAS[i] * vueltas[i]);
			}
			if (diferencia == 0) {
				break;
			} else {
				throw new Exception("El importe es mayor a lo entregado");
			}

		}

		return vueltas;

	}// exception vueltas optimas

	public static float calcularVueltas(float importe, float entregado) throws Exception {
		// TODO vuestro marron

		float dif = 0;
		if (importe <= entregado) {
			dif = entregado - importe;

		} else {
			throw new Exception("El importe es mayor a lo entregado");

		}
		return dif;
	}// exception vueltas
}// class
