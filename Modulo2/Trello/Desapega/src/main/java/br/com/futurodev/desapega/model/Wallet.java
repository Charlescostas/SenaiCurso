package br.com.futurodev.desapega.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wallets")
@Getter
@Setter
public class Wallet {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private double balance;

    //@OneToOne(mappedBy = "person")
    //private Person person;

    public Wallet() {
    }

    public Wallet(Long id) {
    }
}
