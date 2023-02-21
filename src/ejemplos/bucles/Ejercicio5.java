package ejemplos.bucles;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*
	 * Pruebas:
	 * 
	 * --BUCLES
	 * 
	 * 		no se puede hacer la prueba de 0 iteraciones porque es un do-while.
	 * 
	 * 		1 iteración -> respuesta: "IGUAL" -> resultado esperado: has acertado.
	 * 
	 * 		no hay un máximo número de iteraciones.
	 * 
	 * 		como valores intermedios -> respuesta: "MAYOR"
	 * 								 -> respuesta: "MENOR"
	 * 								 -> respuesta: "IGUAL" -> resultado esperado: has acertado
	 * 
	 */

	public static void main(String[] args) {
		int numero;
		String respuesta="";
		Scanner sc = new Scanner(System.in);
		int menor=0;
		int mayor=101;
		do {
			numero = (int)(Math.random()*(mayor-menor)+menor);
			System.out.println("¿Es el número " + numero + "?");
			respuesta = sc.nextLine();
			
			if(respuesta.equals("MAYOR")) {
				mayor = numero;
			} else if(respuesta.equals("MENOR")) {
				menor = numero;
			}
			
		}while(!respuesta.equals("IGUAL"));
		
		System.out.println("¡¡ENHORABUENA!! Has acertado");
	}

}
