package ejemplos.bucles;

public class TablaMultiplicar {
	
	/*
	 * Pruebas:
	 * 
	 * --BUCLES
	 * 
	 * 		0 iteraciones -> numero= -2 ->resultado esperado: "no ha introducido un número positivo"
	 * 
	 * 		1 iteración -> numero= 1 -> resultado esperado: no es primo.
	 * 
	 * 		valores intermedios -> numero=6 -> resultado esperado: no es primo.
	 * 							-> numero=7 -> resultado esperado: es primo.
	 * 
	 * 		el número máximo de iteraciones es el que marca el propio valor introducido.
	 * 
	 * 	
	 * --CUBRIMIENTO
	 * 
	 * 		las pruebas de cubrimiento coinciden con las pruebas de bucles.
	 * 
	 */

	public static void main(String[] args) {
		for (int tabla = 1; tabla <= 10; tabla++) {
			System.out.println("\nTABLA DE MULTIPLICAR DEL " + tabla);
			for (int i = 1; i <= 10; i++) {
				System.out.println(tabla + " x " + i + " = " + (tabla*i));
			}
		}
	}

}
