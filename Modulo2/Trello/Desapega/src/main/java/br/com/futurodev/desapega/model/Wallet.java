package br.com.futurodev.desapega.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "wallets")
@Getter
@Setter
@RequiredArgsConstructor
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @DecimalMin(value = "0.00", inclusive = false)
    @Digits(integer=10, fraction=2)
    private BigDecimal balance;
}
