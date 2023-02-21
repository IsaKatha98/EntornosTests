package ejemplos.bucles;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*
	 * Pruebas:
	 * 
	 * --BUCLES
	 * 
	 * 		0 iteraciones -> valor: -2 ->resultado esperado: "no ha introducido un número positivo"
	 * 
	 * 		1 iteración -> valor=0 -> resultado esperado: 1
	 * 
	 * 		el número máximo de iteraciones es el que marca el propio valor introducido.
	 * 
	 * --CUBRIMIENTO
	 * 
	 * 		Coinciden con las pruebas de bucles.
	 * 
	 */

	public static void main(String[] args) {
		int numero;
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un entero positivo.");
		numero = sc.nextInt();
		
		if(numero>=0) {
			for(int i=numero; i>=1; i--) {
				factorial *= i;
			}
			
			System.out.println("El factorial es: " + factorial);
		} else {
			System.out.println("No ha introducido un número positivo.");
		}
		sc.close();
	}
}
