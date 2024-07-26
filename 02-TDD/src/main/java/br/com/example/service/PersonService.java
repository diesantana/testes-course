package br.com.example.service;

import java.util.concurrent.atomic.AtomicLong;

import br.com.example.model.Person;

public class PersonService implements IPersonService {

	@Override
	public Person createPerson(Person person) {
		
		// Verifica se o email é null
		if(person.getEmail() == null || person.getEmail().isBlank()) 
			throw new IllegalArgumentException("The Person email is null or empty");
		
		// Simulando acesso a base de dados para pegar o id
		var id = new AtomicLong().incrementAndGet();
		person.setId(id);
		return person;
	}

}
