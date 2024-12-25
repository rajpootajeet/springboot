package net.texala.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.texala.model.Person;
import net.texala.service.PersonService;

@RestController
@RequestMapping("/v0/persons")
public class PersonController {

	@Autowired
	private PersonService service;

	@GetMapping
	public ResponseEntity<List<Person>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Person>> findById(@PathVariable int id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public ResponseEntity<Person> save(@RequestBody Person person) {
		return ResponseEntity.ok(service.add(person));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Person> update(@PathVariable int id, @RequestBody Person person) {
		person.setId(id);
		return ResponseEntity.ok(service.update(person));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		service.delete(id);
		return ResponseEntity.ok("person delete success with id" + id);
	}
}
