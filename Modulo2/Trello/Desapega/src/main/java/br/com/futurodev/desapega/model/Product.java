package br.com.futurodev.desapega.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(length = 150, nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;

    @DecimalMin(value = "0.00", inclusive = false)
    @Digits(integer=10, fraction=2)
    private BigDecimal price;

    @Column(columnDefinition = "boolean default false")
    private boolean sold;

    @Column(columnDefinition = "boolean default false")
    private boolean deleted;

    //@Column
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;
}
