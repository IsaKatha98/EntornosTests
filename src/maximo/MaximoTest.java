package maximo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximoTest {

	@ParameterizedTest
	@MethodSource("maximo")
	void maximoTest(int num1, int num2, int expected) {
		
		int res= Maximo.maximo(num1, num2);
		assertEquals (expected, res);
		
		
	}
	
	private static Stream<Arguments> maximo() {
		
		return Stream.of(
				
				Arguments.of(1, 2, 2),
				Arguments.of(2 ,1, 2)
				
				);
				
				
	}

}
