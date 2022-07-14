package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods<T,S,U>{
	private List<T> dato = new ArrayList<>();
	private List<S> dato1 = new ArrayList<>();
	private List<U> dato2 = new ArrayList<>();
	
	public GenericMethods(List<T> dato, List<S> dato1, List<U> dato2) {
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
	
	public void mostrarDatos(List<T> dato, List<S> dato1, List<U> dato2) {
		System.out.println(dato + " " + dato1 + " " + dato2);
	}
}