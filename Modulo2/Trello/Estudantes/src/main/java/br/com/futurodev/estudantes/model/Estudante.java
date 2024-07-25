package br.com.futurodev.estudantes.model;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

public class Estudante {
    @NotNull
    public Integer registro;

    @NotNull
    public String nome;

    @NotNull
    public String email;

    public Estudante() {
    }

    public Estudante(Integer registro, String nome, String email) {
        this.registro = registro;
        this.nome = nome;
        this.email = email;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(registro, estudante.registro) && Objects.equals(nome, estudante.nome) && Objects.equals(email, estudante.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro, nome, email);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "Registro=" + registro +
                ", Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
