package n1exercici1;

public class NoGenericMethods {
	//atributos
	private String nombre1;
	private String nombre2;
	private String nombre3;
	
	//Constructor
	public NoGenericMethods(String nombre1, String nombre2, String nombre3) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.nombre3 = nombre3;
	}

	//Getter
	public String getNombre1() {
		return this.nombre1;
	}
	public String getNombre2() {
		return this.nombre2;
	}
	public String getNombre3() {
		return this.nombre3;
	}
	
	//Setter
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}
}