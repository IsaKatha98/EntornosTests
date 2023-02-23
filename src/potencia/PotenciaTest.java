package potencia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PotenciaTest {

	@ParameterizedTest
	@MethodSource("potencia")
	void potenciaTest(double a, int n, double expected) {
		
		double res= Potencia.potencia(a, n);
		assertEquals (expected, res);
		
		
	}

	private static Stream<Arguments> potencia () {
		
		return Stream.of(
				
				Arguments.of(2, 3, 8),
				Arguments.of(3,1,3)
				
				);
	}
}
