package potencia;

public class Potencia {
	/**
	 * Función que devuelve el resultado de elevar 'a' a 'n'
	 * @param a La base de la potencia
	 * @param n El exponente de la potencia
	 * @return El resultado de elevar 'a' a 'n'
	 */
	public static double potencia (double a, int n) {
		double result=1;
				
		if(n==1) {
			result=a;
		} else if (n>1){
			result = a*potencia(a, n-1);
		}
		return result;
	}
	
}
