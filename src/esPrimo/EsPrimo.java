package esPrimo;

public class EsPrimo {

	/**
	 * Función que dado un número nos dice si es o no primo
	 * @param numero Número a comprobar si es primo o no
	 * @return true si numero es primo. false en caso contrario
	 */
	
	/*
	 * Prueba de bucles:
	 * 
	 * 		- 0 iteracciones -> Cuando num= -1 -> Resultado esperado: false -> Resultado obtenido: true (porque está inicializado a true).
	 * 
	 * 		- 1 iteracion -> cuando num=4 -> Resultado esperado: false -> REsultado obtenido: false
	 * 
	 * 		- Valores intermedios -> num=7 -> Resultado esperado: true ->  REsultado obtenido: bucle infinito.
	 */
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		int divisor = 2;

		if (numero<=1) {
			
			esPrimo= false;
		} else {
			
			while(esPrimo && divisor<=numero/2) {
				if(numero%divisor==0) {
					esPrimo = false;
				}
				divisor++;
			}
			
		}
		
		return esPrimo;
	}
}
