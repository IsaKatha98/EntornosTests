package ejemplos.bucles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio01Test {

	@ParameterizedTest
	@MethodSource("suma")
	void test(int num, int expected) { 
		
		int res= Ejercicio1.sumaNum(num);
		assertEquals (expected, res);
		
	}
	
private static Stream<Arguments> suma() {
		
		return Stream.of(
				
				Arguments.of(3, 3),
				Arguments.of(-2, 0)
				
				);
				
				
	}

}
