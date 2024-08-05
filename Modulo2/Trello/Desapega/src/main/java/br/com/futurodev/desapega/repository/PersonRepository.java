package br.com.futurodev.desapega.repository;

import br.com.futurodev.desapega.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    boolean existsByEmail(String email);

    Optional<Person> findByIdAndDeletedFalse(Long id);

    List<Person> findAllByIdInAndDeletedFalse(Iterable<Long> ids);

    Optional<Person> findByEmailAndDeletedFalse(String email);
}