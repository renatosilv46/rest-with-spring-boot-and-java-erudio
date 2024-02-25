package br.com.renato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.renato.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
