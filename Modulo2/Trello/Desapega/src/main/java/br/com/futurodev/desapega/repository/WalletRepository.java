package br.com.futurodev.desapega.repository;

import br.com.futurodev.desapega.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
