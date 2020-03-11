package com.ipartek.formacion.clases;

public class Vehiculo {

	// 1. atributos
	private String color;
	private String matricula;
	private int numeroRuedas;
	private int numeroPuertas;
	private float potencia; // caballos

	// 2. constructores
	public Vehiculo() {
		super(); // una buea practica es mencionar cada atributo y darle un valor inicial
		this.color = "";
		this.matricula = "";
		this.numeroRuedas = 0;
		this.numeroPuertas = 0;
		this.potencia = 0;

	}

	// constructor sobrecargado (en caso de que queramos dar valores iniciales
	// distintos a los mencionados antes)
	public Vehiculo(String color, String matricula) {
		// super();// hace referencia a la super clase o padre
		this(); // llamamos al constructor por defecto, hace referencia a su propia clase
		this.color = color;
		this.matricula = matricula;
	}

	public Vehiculo(String color, String matricula, int numeroPuertas) {
		// super();
		this(color, matricula);// llamo al constructor anterior, luego este llama a los valores inicializados
		// this.color = color;
		// this.matricula = matricula;
		this.numeroPuertas = numeroPuertas;
	}

	// 3. getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	// 4. toString
	@Override // sobre-escritura el metodo del padre
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + ", numeroRuedas=" + numeroRuedas
				+ ", numeroPuertas=" + numeroPuertas + ", potencia=" + potencia + "]";
	}

}

// 5. resto de [ metodos || funciones || comportamientos ] si hace falta

//class
