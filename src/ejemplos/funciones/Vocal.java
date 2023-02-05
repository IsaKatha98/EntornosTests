package ejemplos.funciones;

public class Vocal {

	/**
	 * Función que nos dice si la letra introducida es una vocal o no
	 * 
	 * @param letra Cadena de caracteres que debe contener una única letra
	 * @return true si la letra introducida coincide con alguna de las vocales.
	 *         false en caso contrario
	 */
	public static boolean esVocal(String letra) {
		boolean result = false;

		// Si la letra introducida coincide con alguna de las vocales devolvemos true
		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
				|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			result = true;
		} // fin if

		return result;
	} // fin esVocal
} // fin clase
