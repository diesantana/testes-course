package arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysTest {

	@DisplayName("Arrays testing")
	@Test
	void testArray_When_Sorted_SholdCorrectSorted() {
		// Given 
		int[] numbers = {25, 8, 21, 32, 3};
		int[] expected = {3, 8, 21, 25, 32};
		
		// When
		Arrays.sort(numbers);
		
		// Then
		assertArrayEquals(expected, numbers);
	}
	
	@DisplayName("Teste com timeout")
	@Test
	@Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
	void testArray_When_Sorted_SholdExecutedLimitTimeout() {
		int[] numbers = {25, 8, 21, 32, 3};
		
		for (int i = 0; i < 10000000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
		
	}

}
