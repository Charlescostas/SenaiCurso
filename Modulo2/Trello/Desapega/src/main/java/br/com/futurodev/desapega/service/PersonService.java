package br.com.futurodev.desapega.service;

import br.com.futurodev.desapega.exception.UserAlreadyRegisteredException;
import br.com.futurodev.desapega.exception.PersonNotFoundException;
import br.com.futurodev.desapega.model.Person;
import br.com.futurodev.desapega.model.Wallet;
import br.com.futurodev.desapega.model.transport.CreatePersonForm;
import br.com.futurodev.desapega.model.transport.PersonDTO;
import br.com.futurodev.desapega.repository.PersonRepository;
import br.com.futurodev.desapega.repository.WalletRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements UserDetailsService {
    private final PersonRepository personRepository;
    private final PasswordEncoder passwordEncoder;
    private WalletRepository walletRepository;

    public PersonService(PersonRepository personRepository, PasswordEncoder passwordEncoder) {
        this.personRepository = personRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.personRepository.findByEmailAndDeletedFalse(username)
                   .orElseThrow(() -> new UsernameNotFoundException(username));
    }

    public PersonDTO getSinglePerson(String email) throws PersonNotFoundException {
        return this.personRepository.findByEmailAndDeletedFalse(email)
                .map(PersonDTO::new)
                .orElseThrow(() -> new PersonNotFoundException(email));
    }

    public Person getSinglePersonAsEntity(String email) throws PersonNotFoundException {
        return this.personRepository.findByEmailAndDeletedFalse(email)
                .orElseThrow(() -> new PersonNotFoundException(email));
    }

    @Transactional
    public PersonDTO createPerson(CreatePersonForm form) throws UserAlreadyRegisteredException {
        if (this.personRepository.existsByEmail(form.email())){
            throw new UserAlreadyRegisteredException(form.email());
        }

        String encodedPassword = this.passwordEncoder.encode(form.password());
        Person persistedPerson = this.personRepository.save(new Person(form, encodedPassword));

        Wallet wallet = new Wallet();
        wallet.setId(persistedPerson.getId());
        persistedPerson.setWallet(wallet);

        return new PersonDTO(persistedPerson);
    }
}
