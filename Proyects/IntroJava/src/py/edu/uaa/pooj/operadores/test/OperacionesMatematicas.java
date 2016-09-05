package py.edu.uaa.pooj.operadores.test;

public class OperacionesMatematicas {

	


	// PRACTICA
	public int encontrarMinimo(int [] numeros) {
		// TODO "Encontrar el valor minimo de un array de enteros"
		int minimo = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if(minimo>numeros[i]){
				minimo=numeros[i];
				
			}
		}
		
		return minimo;
	}

	// PRACTICA
	public int encontrarMaximo(int [] numeros) {
		// TODO "Encontrar el valor maximo de un array de enteros"
		int maximo = numeros[0];
		for (int i=0; i< numeros.length; i++){
			if(maximo<numeros[i]){
				maximo=numeros[i];
			}
		}
		return maximo;
	}

	// PRACTICA
	/*public int[] filtrarImpares(int [] numeros) {
		// TODO
		// "En base a un array de enteros recibidos como parametros, filtrar solamente los numeros impares"
		int j=1;
		int [] cadenaImpar = null;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2!=0){
				cadenaImpar[j]= numeros[i]; 
				j++;
				i++;
			}
			else{
				i++;
			}
		}
		
			return cadenaImpar;
			
		
		
	}
	
	public static void main (String[] args){
		// Se crea un objeto de la clase OperacionesMatematicas llamado testOperMat
		
		OperacionesMatematicas testOperMat = new OperacionesMatematicas();
		// se crea un array de numeros enteros
		int [] numerosAEvaluar = {5,4,2,1,6};
		
		//for (int j = 0; j < testOperMat.filtrarImpares.) {
			
		}
		//System.out.println(testOperMat.filtrarImpares(numerosAEvaluar));
		
		*/
	}

