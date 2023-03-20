package ejemplos.bucles;

import java.util.Scanner;

/*
 * Pruebas de bucles:
 * 
 * 		- 0 iteraciones -> cuando num= -1 -> Resultado esperado:0
 * 
 * 		- 1 iteracion -> cuando num=0 y luego num=-1 -> Resultado esperado: 0
 * 
 * 		- Máximo de iteraciones -> no se pueden definir pruebas porque no hay un máximo definido
 * 
 * 		- Máximo + 1 ->
 * 
 * 		- Máximo - 1 ->
 * 
 * 		- Valor intermedio ->
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// En suma guardaré el resultado de sumar todos los números introducidos por el
		// usuario
		int suma = 0;

		// num es el valor introducido por el usuario por teclado
		int num = 0;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un número:
		System.out.println(
				"Introduzca un número entero positivo para sumarlo. "
				+ "Introduzca un valor negativo para salir del programa. ");

		num = sc.nextInt();
		
		suma=sumaNum (num);
		
		// Imprimo el resultado de la suma
		System.out.println("La suma total de los números introducidos es: " + suma);

		sc.close();
	}
	
	public static int sumaNum (int num) {
		
		int res=0;
		int suma=0;
		
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		while (num >= 0) {

			// Le añado a la variable el valor de num
			suma += num;

			// Le vuelvo a pedir al usuario un número
			num = sc.nextInt();
		}
		
		res=suma;
		
		return res;
		
	}

}
