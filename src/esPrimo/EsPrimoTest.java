package esPrimo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EsPrimoTest {

	@ParameterizedTest
	@MethodSource("esPrimo")
	void esPrimoTest(int num, boolean expected) {
		
		boolean res =EsPrimo.esPrimo(num);
		assertEquals (expected, res);
		
	}

	private static Stream<Arguments> esPrimo() {
		
		return Stream.of (
				
				Arguments.of(7, true),
				Arguments.of(6, false)
				
				);
	}
}
