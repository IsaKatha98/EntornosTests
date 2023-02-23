package ejemplos.funciones.calculadora;

public class Calculadora {

	/**
	 * Función que realiza la operación indicada en el parámetro opcion sobre los
	 * valores de num1 y num2
	 * 
	 * @param num1   Primero número con el que realizar la operación
	 * @param num2   Segundo número con el que realizar la operación
	 * @param opcion Operación a realizar: 1-Suma, 2-Resta, 3-Multiplicación,
	 *               4-División
	 * @return El resultado de realizar la operación seleccionada sobre los números
	 *         introducidos como parámetro
	 *         
	 *         
	 *        
	 */
	
	/*
	 * Pruebas de funciones.
	 * 
	 *		- Cuando num1=2, num2=2, opc=1 -> Resultado esperado:4
	 *
	 *		- Cuando num1=2, num2=2, opc=2 -> Resultado esperado:0
	 *
	 *		- Cuando num1=2, num=0, opc=4 -> Resutlado esperado: Error
	 */
	public static double calculadora(double num1, double num2, int opcion) {
		double result = 0;

		switch (opcion) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		}
		return result;
	}
}
