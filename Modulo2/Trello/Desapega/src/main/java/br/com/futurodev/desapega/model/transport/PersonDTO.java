package br.com.futurodev.desapega.model.transport;

import br.com.futurodev.desapega.model.Person;

public record PersonDTO(Long id,
                        String name,
                        String email) {

    public PersonDTO(Person person) {
        this(person.getId(), person.getName(), person.getEmail());
    }
}
