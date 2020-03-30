package herencia.animales;

public class Animales {
	
	//atributos
	private String nombre;
	private int a�os;
	
	
	//constructor
	public Animales() {
		super();
		this.nombre = "";
		this.a�os = 0;
	}


	public Animales(String nombre, int a�os) {
		//super();
		this();
		this.nombre = nombre;
		this.a�os = a�os;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getA�os() {
		return a�os;
	}


	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

	
	//toString
	@Override
	public String toString() {
		return "animales [nombre=" + nombre + ", a�os=" + a�os + "]";
	}
	

}
