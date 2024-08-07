package br.com.futurodev.desapega.model.transport;

import br.com.futurodev.desapega.model.Wallet;
import jakarta.validation.constraints.NotBlank;

public record CreatePersonForm(@NotBlank String name,
                               @NotBlank String email,
                               @NotBlank String password,
                               @NotBlank String phone,
                               Wallet wallet){
}