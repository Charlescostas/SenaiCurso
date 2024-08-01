package br.com.futurodev.pokedex.service.interfaces;

import br.com.futurodev.pokedex.dto.PokemonRequestDto;
import br.com.futurodev.pokedex.dto.PokemonResponseDto;
import org.springframework.data.domain.Page;

public interface PokemonService {
    PokemonResponseDto create(PokemonRequestDto dto);
    PokemonResponseDto update(Long id, PokemonRequestDto dto);
    PokemonResponseDto findById(Long id);
    Page<PokemonResponseDto> findAll();
    void delete(Long id);
}
