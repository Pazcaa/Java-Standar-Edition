package herencia.animales;

public class Pez extends Animales{
	public static char AGUA_DULCE = 'd';
	public static char AGUA_SALADA = 's';
	
	//atributos
	
	private char agua; //tipo de agua en que vive el pez

	//constructor
	public Pez() {
		super();
		this.agua = 0;
	}

	//getter and setter
	public char getAgua() {
		return agua;
	}

	public void setAgua(char agua) {
		this.agua = agua;
	}

	//toString
	@Override
	public String toString() {
		return "Pez [agua=" + agua + "]";
	}
	
	
	


}
