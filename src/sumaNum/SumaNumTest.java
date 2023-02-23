package sumaNum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumTest {

	@ParameterizedTest
	@MethodSource("suma")
	void sumaNumTest(int num, int expected) {
		
		int res= SumaNumeros.sumaNumeros(num);
		assertEquals (expected, res);
	
	}

	private static Stream<Arguments> suma () {
		
		return Stream.of (
				
				Arguments.of (3, 6),
				Arguments.of(9, 45)
				
				);
				
				
	}
}
