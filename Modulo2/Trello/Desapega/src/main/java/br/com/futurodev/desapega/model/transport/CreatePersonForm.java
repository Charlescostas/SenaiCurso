package br.com.futurodev.desapega.model.transport;

import jakarta.validation.constraints.NotBlank;

public record CreatePersonForm(@NotBlank String name,
                               @NotBlank String email,
                               @NotBlank String password) {
}