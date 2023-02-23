package maximo;

public class Maximo {

	/**
	 * Función que devuelve el máximo de dos números
	 * @param numero1 Primer número
	 * @param numero2 Segundo número
	 * @return El máximo de los dos números introducidos por parámetro
	 */
	
	/*
	 * Pruebas de condiciones:
	 * 
	 * 		- Cuando num1=1; num2=3 -> Resultado esperado: maximo=3 -> Resultado obtenido: maximo:3
	 * 
	 * 		- Cuando num1=3; num2=1 -> Resultado esperado: maximo=3 -> Resultado obtenido: maximo=3
	 */
	static int maximo (int numero1, int numero2) {
		// Suponemos que el máximo es numero1
		int maximo = numero1;
		
		// Si numero2 es mayor que numero1
		if(numero2 > numero1) {
			// El máximo es numero2
			maximo = numero2;
		}
		
		return maximo;
	}
}
