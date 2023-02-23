package vocal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class VocalTest {

	@ParameterizedTest
	@MethodSource ("vocal")
	
	void vocalTest(String vocal, boolean expected) {
		
		boolean res= Vocal.esVocal(vocal);
		assertEquals (expected, res);
		
		
	}

	public static Stream<Arguments> vocal () {
		
		return Stream.of(
				
				Arguments.of ("a", true),
				Arguments.of ("b", false)
				
				);
				
				
	}
}
