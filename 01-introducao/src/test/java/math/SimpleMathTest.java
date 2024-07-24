package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
	
	SimpleMath simpleMath;
	
	@BeforeAll
	static void setup() {
		System.out.println("Running @BeforeAll method!");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("Running @AfterAll method!");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Running @BeforeEach method!");
		simpleMath = new SimpleMath();		
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running @AfterEach method!");		
	}
	
	@Test
	@DisplayName("Test Sum method with valid data")
	void testSum_When_DoubleNumbers_SholdReturnCorrectSum() {
		System.out.println("Execução do teste sum");
		
		// Given: Preparação
		double firstNumber = 6.2;
		double secondNumber = 2.0;
		double expected = 8.2;
		
		// When: Execução
		Double actual = simpleMath.sum(firstNumber, secondNumber);
		
		// Then: Resultado esperado
		String message = "The testSum() did not produce expected result!";
		assertEquals(actual, expected, () -> message);
	}
	
	//@Disabled("TODO: Código não implemendado")
	@Test
	@DisplayName("Test Subtraction method with valid data")
	void testSubtraction_When_ValidData_SholdReturnCorrect() {
		System.out.println("Execução do teste subtraction");
		
		// Given: Preparação
		Double expected = 2.0;
		// When: Execução 
		Double actual = simpleMath.subtraction(5.0, 3.0);
		// Then: Resultado
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test Sum with invalid data")
	void testSum_When_InvalidData_SholdReturnIllegalArgumentException() {
		// Given 
		Double firstNumber = -5.0;
		Double secondNumber = 3.0;
		
		// When
		// Then
		assertThrows(IllegalArgumentException.class, () -> {
			simpleMath.sum(firstNumber, secondNumber);
		},  () -> "Nenhuma exceção foi lançada");
	}

	@Disabled("Teste desabilitado")
	@Test
	@DisplayName("Test Sum with invalid data return msg")
	void testSum_When_InvalidData_SholdReturnIllegalArgumentExceptionWithMsg() {
		// Given 
		Double firstNumber = -5.0;
		Double secondNumber = 3.0;
		String expected = "Os valores de entrada devem ser positivos";
		// When
		IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
			simpleMath.sum(firstNumber, secondNumber);
		},  () -> "Nenhuma exceção foi lançada");
		// Then
		assertEquals(expected, actual.getMessage());
	}

	
	
	
}
