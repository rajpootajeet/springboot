package net.texala.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.texala.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
