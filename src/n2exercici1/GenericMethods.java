package n2exercici1;

public class GenericMethods<T,S,Integer> {
	private T dato;
	private S dato1;
	private int dato2;//Convertimos en dato no generico y lo pasamos a tipo primitivo int
	
	public GenericMethods(T dato, S dato1, int dato2) {
		this.dato = dato;
		this.dato1 = dato1;
		this.dato2 = dato2;
	}
	/*//Getter
	public T getDato() {
		return this.dato;
	}
	public K getDato1() {
		return this.dato1;
	}
	public V getDato2() {
		return this.dato2;
	}
	
	//Setter
	public void setDato(T dato){
		this.dato = dato;
	}
	public void setDato1(K dato1){
		this.dato1 = dato1;
	}
	public void setDato2(V dato2){
		this.dato2 = dato2;
	}
	*/
	
	public void mostrarDatos(T dato, S dato1, int dato2) {
		System.out.println(dato + " " + dato1 + " " + dato2);
	}
}