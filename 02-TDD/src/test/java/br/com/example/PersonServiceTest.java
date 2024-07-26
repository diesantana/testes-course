package br.com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.example.model.Person;
import br.com.example.service.IPersonService;
import br.com.example.service.PersonService;

class PersonServiceTest {
	
	IPersonService personService;
	Person expected;

	@BeforeEach
	void setUp() throws Exception {
		personService = new PersonService();
		expected = new Person(
				"Bob", 
				"Brown", 
				"Rua 01", 
				"Male", 
				"bob@gmail.com"
				);
	}

	@DisplayName("CreatePerson() Shold return the Person Obj")
	@Test
	void testCreatePerson_WhenSuccess_SholdReturnPersonObject() {
		// Given / Arrange
		// When / Act
		Person actual = personService.createPerson(expected);
		// Then / Assert 
		assertNotNull(actual, () -> "Failed assertNotNull Obj");
		assertNotNull(actual.getId(), () -> "Failed assertNotNull Id");
		assertEquals(expected.getFirstName(), actual.getFirstName(), () -> "Failed assertNotNull");
		assertEquals(expected.getLastName(), actual.getLastName(), () -> "Failed assertEquals LastName");
		assertEquals(expected.getAddress(), actual.getAddress(), () -> "Failed assertEquals Address");
		assertEquals(expected.getGender(), actual.getGender(), () -> "Failed assertEquals Gender");
		assertEquals(expected.getEmail(), actual.getEmail(), () -> "Failed assertEquals Email");
	}
	
	@DisplayName("CreatePerson() Shold throw IllegalArgumentException when email is null")
	@Test
	void testCreatePerson_WhenEmailIsNull_SholdThrowIllegalArgumentException() {
		// Given / Arrange
		expected.setEmail(null);
		//expected.setEmail("");
		// When / Act
		// Then / Assert 
		assertThrows(IllegalArgumentException.class, () -> {
			personService.createPerson(expected);
		}, () -> "createPerson did not throw IllegalArgumentException");
	}
	
	@DisplayName("CreatePerson() with null email shold throw the correct msg in the exception")
	@Test
	void testCreatePerson_WhenEmailIsNull_SholdThrowCorrectMessage() {
		// Given / Arrange
		expected.setEmail(null);
		String expectedMessage = "The Person email is null or empty";
		//expected.setEmail("");
		// When / Act
		// Then / Assert 
		IllegalArgumentException  exception = assertThrows(IllegalArgumentException.class, () -> {
			personService.createPerson(expected);
		}, () -> "createPerson did not throw IllegalArgumentException");
		
		assertEquals(expectedMessage, exception.getMessage(), () -> "The message does not match");
		
	}
}
