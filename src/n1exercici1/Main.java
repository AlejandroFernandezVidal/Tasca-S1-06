package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos dos objetos de la clase NoGenericMethods y podemos poner en cualquier orden los parámetros ya que los 3 son del mismo tipo
		NoGenericMethods listaNombres = new NoGenericMethods("Pepe","Sheila","Rafael");
		NoGenericMethods listaNombres2 = new NoGenericMethods("Rafael","Pepe","Sheila");
		System.out.println(listaNombres.getNombre1() + " " + listaNombres.getNombre2() + " " + listaNombres.getNombre3());
		System.out.println(listaNombres2.getNombre2() + " " + listaNombres2.getNombre3() + " " + listaNombres2.getNombre1());
	}
}