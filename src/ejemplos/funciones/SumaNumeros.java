package ejemplos.funciones;

public class SumaNumeros {

	/**
	 * Función que devuelve la suma de todos los números desde el 1 hasta num
	 * incluidos
	 *  
	 * @param num Número hasta el cual se realiza la suma
	 * @return La suma de todos los números comprendidos desde 1 hasta num
	 */
	public static int sumaNumeros(int num) {
		int result = 0;

		for (int i = 1; i <= num; i++) {
			result += i;
		}
		return result;
	}
}
