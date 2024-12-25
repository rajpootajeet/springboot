package net.texala.service;

import java.util.List;
import java.util.Optional;

import net.texala.model.Person;

public interface PersonService {

	public List<Person> findAll();

	public Optional<Person> findById(int id);

	public Person add(Person person);

	public Person update(Person person);

	public void delete(int id);
}
