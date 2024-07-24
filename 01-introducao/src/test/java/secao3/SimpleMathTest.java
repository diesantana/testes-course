package secao3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import math.SimpleMath;

@Order(1)
class SimpleMathTest {
	
	SimpleMath simpleMath;
	
	@BeforeEach
	void beforeEach() {
		simpleMath = new SimpleMath();		
	}

	/*
	@ParameterizedTest 
	@MethodSource()
	@DisplayName("Test Sum method with valid data")
	void testSum_When_DoubleNumbers_SholdReturnCorrectSum(double firstNumber, double secondNumber, double expected) {
		System.out.println("Execução do teste sum");
		
		// When: Execução
		Double actual = simpleMath.sum(firstNumber, secondNumber);
		
		// Then: Resultado esperado
		String message = "The testSum() did not produce expected result!";
		assertEquals(actual, expected, () -> message);
	}
	
	
	public static Stream<Arguments> testSum_When_DoubleNumbers_SholdReturnCorrectSum() {
		return Stream.of(
				Arguments.of(6.2, 2.0, 8.2),
				Arguments.of(6.0, 4.2, 10.2),
				Arguments.of(24.8, 24.2, 49.0)
		);
	}*/
	
	/*
	@ParameterizedTest 
	@CsvSource({
		"6.2, 2.0, 8.2",
		"6.0, 4.2, 10.2",
		"24.8, 24.2, 49.0"
	})
	@DisplayName("Test Sum method with valid data")
	void testSum_When_DoubleNumbers_SholdReturnCorrectSum(double firstNumber, double secondNumber, double expected) {
		System.out.println("Execução do teste sum");
		
		// When: Execução
		Double actual = simpleMath.sum(firstNumber, secondNumber);
		
		// Then: Resultado esperado
		String message = "The testSum() did not produce expected result!";
		assertEquals(actual, expected, () -> message);
	}*/
	
	@ParameterizedTest 
	@CsvFileSource(resources = "/testSumValidData.csv")
	@DisplayName("Test Sum method with valid data")
	void testSum_When_DoubleNumbers_SholdReturnCorrectSum(double firstNumber, double secondNumber, double expected) {
		System.out.println("Execução do teste sum");
		
		// When: Execução
		Double actual = simpleMath.sum(firstNumber, secondNumber);
		
		// Then: Resultado esperado
		String message = "The testSum() did not produce expected result!";
		assertEquals(actual, expected, () -> message);
	}
	
}
