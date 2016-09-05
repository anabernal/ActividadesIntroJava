package py.edu.uaa.pooj.operadores.test;

public class TestCadenasIteradores {

	/*
	 * metodo que concatena todas las palabras almacenadas en el array de String recibido
	 * como parametro, agregando un espacio en blanco despues de cada palabra
	 */
	
	public String concatenarCadenas(String[] arrayString){
		//TODO: "concatenar las palabras contenidas en el array recibido como parametro "
		
		String concatenacion= "";
		for (int i=0; i< arrayString.length; i++	){
		concatenacion= concatenacion + " " + arrayString[i];	
		}
		
		return concatenacion;
	}
	
	public static void main (String[] args){
		//Crear un objeto de la clase TestCadenas, llamado testCad
		TestCadenasIteradores testCad = new TestCadenasIteradores();
		//crear array random
		String[] cadenaAConcatenar = {"Hola", "mundo", "de", "la", "programación"};
		
			System.out.println(testCad.concatenarCadenas(cadenaAConcatenar));	
}
		
		
	}

	

	


     



