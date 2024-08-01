package br.com.futurodev.pokedex.dto;

import lombok.Data;

@Data
public class PokemonResponseDto {
    private Long numero;
    private String nome;
    private String descricao;
    private String imagemURL;
    private String tipo;
    private String categoria;
    private String areaHabita;
    private double altura;
    private double peso;
}
