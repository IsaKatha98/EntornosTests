package ejemplos.funciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestCalculadora {

	@ParameterizedTest
	@MethodSource ("calculos")
	void calculadoraTest (double num1, double num2, int opc, double expected) {
		
		
		double res = Calculadora.calculadora(num1, num2, opc);
		assertEquals(expected, res);
		
	}
	
	private static Stream<Arguments> calculos () {
		
		return Stream.of(
				
				Arguments.of(5,10, 1, 15),
				Arguments.of (6, 4, 2, 2),
				Arguments.of(3,1,3,3),
				Arguments.of(10, 2, 4, 5)
				
				);
	}
	

}
