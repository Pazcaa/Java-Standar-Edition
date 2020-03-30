package herencia.animales;

public class Animales {
	
	//atributos
	private String nombre;
	private int años;
	
	
	//constructor
	public Animales() {
		super();
		this.nombre = "";
		this.años = 0;
	}


	public Animales(String nombre, int años) {
		//super();
		this();
		this.nombre = nombre;
		this.años = años;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAños() {
		return años;
	}


	public void setAños(int años) {
		this.años = años;
	}

	
	//toString
	@Override
	public String toString() {
		return "animales [nombre=" + nombre + ", años=" + años + "]";
	}
	

}
