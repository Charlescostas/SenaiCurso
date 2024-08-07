package br.com.futurodev.desapega.controller;

import br.com.futurodev.desapega.exception.UserAlreadyRegisteredException;
import br.com.futurodev.desapega.model.transport.CreatePersonForm;
import br.com.futurodev.desapega.model.transport.PersonDTO;
import br.com.futurodev.desapega.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody @Valid CreatePersonForm form,
                                                  UriComponentsBuilder uriComponentsBuilder) throws UserAlreadyRegisteredException {
        PersonDTO response = this.personService.createPerson(form);

        URI uri = uriComponentsBuilder
                .path("/persons/{email}")
                .buildAndExpand(response.id())
                .toUri();

        return ResponseEntity.created(uri).body(response);
    }
}
