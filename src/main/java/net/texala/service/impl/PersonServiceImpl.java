package net.texala.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.texala.model.Person;
import net.texala.repo.PersonRepo;
import net.texala.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo repo;

	@Override
	public List<Person> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Person> findById(int id) {
		return repo.findById(id);
	}

	@Override
	@Transactional
	public Person add(Person person) {
		return repo.save(person);
	}

	@Override
	@Transactional
	public Person update(Person person) {
		return repo.save(person);
	}

	@Override
	@Transactional
	public void delete(int id) {
		repo.deleteById(id);
	}

}
