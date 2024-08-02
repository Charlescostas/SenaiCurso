package br.com.futurodev.desapega.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Product {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private boolean sold;
    private boolean deleted;
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;
}
