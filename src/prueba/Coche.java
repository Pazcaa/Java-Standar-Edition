package prueba;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos. La
 * clase coche tendrá los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada.
 * 
 * @author Paz Caamaño Barrera
 *
 */
public class Coche {

	// atributos
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private float potencia;// HP (caballosde fuerza)
	private float cilindrada;// cm3

	// constructores
	public Coche() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.potencia = 0;
		this.cilindrada = 0;

	}

	// gettesr and setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

//	toString
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}

}
