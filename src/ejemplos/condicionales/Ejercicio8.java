package ejemplos.condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*
	 * --CONDICIONES
	 * 
	 *		cuando nota=-1 -> El resultado esperado es error.
	 * 
	 * 		cuando nota=11 ->El resultado esperado es error.
	 * 
	 * 		cuando nota=0 ->el resultado esperado es insuficiente.
	 * 
	 * 		cuando nota=5 -> el resultado esperado es suficiente
	 * 
	 * 		cuando nota=6 -> el resultado esperado es bien.
	 * 
	 * 		cuando nota=7 -> el resultado esperado es notable.
	 * 
	 * 		cuando nota=9 -> el resultado esperado es sobresaliente.
	 * 
	 * 		cuando nota=10 -> el resultado esperado es sobresaliente.
	 * 
	 * --CUBRIMIENTO
	 * 
	 * 		sería igual, se podrían quitar la primera y la última.
	 * 
	 */

	public static void main(String[] args) {
		// nota es la variable donde se guardará la nota introducida por el usuario por teclado
		double nota;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca la nota
		System.out.println("Introduzca una nota. Debe ser un valor comprendido entre 0 y 10");
		nota = sc.nextDouble();
		
		if (nota < 0 || nota > 10) {
			// Si la nota introducida no está en el rango solicitado mostramos un error
			System.out.println("ERROR: La nota introducida no está comprendida entre 0 y 10");
		} else {
			// Si la nota introducida se encuentra en el rango, hacemos las distintas comprobaciones
			if (nota >= 0 && nota < 5) {
				// Si la nota está dentro del rango [0, 5) debe mostrarse INSUFICIENTE
				System.out.println("INSUFICIENTE");
			} else if (nota >= 5 && nota < 6) {
				// Si la nota está dentro del rango [5, 6) debe mostrarse SUFICIENTE
				System.out.println("SUFICIENTE");
			} else if (nota >= 6 && nota < 7) {
				// Si la nota está dentro del rango [6, 7) debe mostrarse BIEN
				System.out.println("BIEN");
			} else if (nota >= 7 && nota < 9) {
				// Si la nota está dentro del rango [7, 9) debe mostrarse NOTABLE
				System.out.println("NOTABLE");
			} else if (nota >= 9 && nota <= 10) {
				// Si la nota está dentro del rango [9, 10] debe mostrarse SOBRESALIENTE
				System.out.println("SOBRESALIENTE");
			}
		}
	}
}
