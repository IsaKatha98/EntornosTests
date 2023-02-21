package ejemplos.condicionales;

import java.util.Scanner;

/* En la resolución de una ecuación de 2º grado tenemos que tener cuidado con dos cosas:
 * 1. Que el valor del interior de la raíz no sea negativo.
 * 2. No podemos dividir por 0.
 * 
 * 
 * Pruebas:
 * 
 * -- coinciden las de cubrimiento y las de condiciones.
 * 
 * -- CUBRIMIENTO
 * 
 * -- Toda la primera parte se ejecuta sin prioblema. Cuando llegue el if, asignamos los siguientes valores:
 * 
 * 		cuando a=0, cuando b y c=1-> no ocurre nada. x1==x2
 * 
 *		cuando a=4, cuando b=2 y c=4 -> sería interiorRaiz negativo, entraría en el segundo if y se imprime
 *		"no tiene solución real"
 *
 *		cuando a=2, b=4 y c=4 ->interiorRaiz será positivo, no entra en el segundo if y se imprime:
 *		"x1=-1; x=-1"
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// Declaramos las variables a, b y c, que serán los coeficientes de la ecuación
		int a, b, c;

		// Declaramos las variables x1 y x2, que serán las soluciones de la ecuación de
		// segundo grado
		double x1, x2;
		
		// Creamos una variable donde guardar la operación que se realiza dentro de la raíz
		double interiorRaiz;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca por teclado los coeficientes de la
		// ecuación de 2º grado
		System.out.println("Introduzca el valor para a:");
		a = sc.nextInt();

		System.out.println("Introduzca el valor para b:");
		b = sc.nextInt();

		System.out.println("Introduzca el valor para c:");
		c = sc.nextInt();

		/*
		 * Si la a vale cero no se trata de una ecuación de 2º grado, pero se podría
		 * resolver como una ecuación de 1º grado
		 */
		if (a == 0) {
			/* TODO: Resolver ecuación de 1º grado */
			
		} else {
			/*
			 * Si lo que se encuentra dentro de la raíz es un valor negativo, la ecuación no
			 * tiene solución
			 */
			interiorRaiz = b^2 - 4*a*c;
			
			if (interiorRaiz < 0) { // Si es negativo, no tiene solución
				System.out.println("La ecuación no tiene solución real.");
			} else { // Si el interior de la raíz es >= 0, entonces sí tiene solución
				
				// Calculamos la primera solución con +
				x1 = (-b + Math.sqrt(interiorRaiz)) / (2*a);
				
				// Calculamos la segunda solución con -
				x2 = (-b - Math.sqrt(interiorRaiz)) / (2*a);
				
				// Mostramos las soluciones al usuario
				System.out.println("Las soluciones de la ecuación son: " + x1 + ", " +x2);
			}
		}
	}
}
