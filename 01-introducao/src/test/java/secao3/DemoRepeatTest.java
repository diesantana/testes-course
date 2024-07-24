package secao3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import math.SimpleMath;

class DemoRepeatTest {
	
	SimpleMath simpleMath;

	@BeforeEach	
	void setUp() throws Exception {
		simpleMath = new SimpleMath();
	}

	@RepeatedTest(value = 3, name = "{displayName}. {currentRepetition} of {totalRepetitions}")
	@DisplayName("Method sum with valid data")
	void testSum_When_ValidData_SholdReturnTheSum(RepetitionInfo info) {
		System.out.println("Execução do teste sum: " + info.getCurrentRepetition());
		
		// Given
		Double firstNumber = 5.0;
		Double secondNumber = 3.0;
		Double expected = 8.0;
		String message = "The testSum() did not produce expected result!";
		
		// When: Execução
		Double actual = simpleMath.sum(firstNumber, secondNumber);
		
		// Then: Resultado esperado
		assertEquals(actual, expected, () -> message);
	}

}
