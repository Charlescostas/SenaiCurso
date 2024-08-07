package br.com.futurodev.desapega.model.transport;

import br.com.futurodev.desapega.model.Person;
import br.com.futurodev.desapega.model.Wallet;

public record PersonDTO(Long id,
                        String name,
                        String email,
                        String phone,
                        WalletDTO wallet) {

    public PersonDTO(Person person) {
       this(person.getId(), person.getName(),
            person.getEmail(), person.getPhone(),
            new WalletDTO(person.getWallet()));
    }
}
