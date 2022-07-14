package n2exercici1;

import n1exercici2.GenericMethods;
import n1exercici2.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Pepe","Navarrete",50);
		String nombre = "Antonio";
		int edat = 40;
		GenericMethods<Persona,String,Integer> objeto = new GenericMethods<>(persona1, nombre, edat);
		objeto.mostrarDatos(persona1, nombre, edat);
	}
}