package net.texala.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "person_master")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "person_name", length = 30)
	private String name;

	@Column(name = "person_email", length = 50, unique = true)
	private String email;

	@Column(name = "person_age")
	private int age;

	@Column(name = "person_profession", length = 50)
	private String profession;
}
