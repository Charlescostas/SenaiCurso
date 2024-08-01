package br.com.futurodev.pokedex.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pokemon")
@Getter
@Setter
@RequiredArgsConstructor
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long numero;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String imagemURL;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String areaHabita;

    @Column(nullable = false)
    private double altura;

    @Column(nullable = false)
    private double peso;

    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", imagemURL='" + imagemURL + '\'' +
                ", tipo='" + tipo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", areaHabita='" + areaHabita + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
