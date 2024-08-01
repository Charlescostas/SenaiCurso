package br.com.futurodev.pokedex.service;

import br.com.futurodev.pokedex.dto.PokemonRequestDto;
import br.com.futurodev.pokedex.dto.PokemonResponseDto;
import br.com.futurodev.pokedex.models.Pokemon;
import br.com.futurodev.pokedex.repository.PokemonRepository;
import br.com.futurodev.pokedex.service.interfaces.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    @Override
    public PokemonResponseDto create(PokemonRequestDto dto) {
        Pokemon pokemon = new Pokemon();
        BeanUtils.copyProperties(dto, pokemon);

        pokemonRepository.save(pokemon);

        return this.mapToResponse(pokemon);
    }

    @Override
    public PokemonResponseDto update(Long id, PokemonRequestDto dto) {
        Pokemon pokemon = this.findEntityById(id);
        BeanUtils.copyProperties(dto, pokemon);

        pokemonRepository.save(pokemon);

        return this.mapToResponse(pokemon);
    }

    @Override
    public PokemonResponseDto findById(Long id) {
        Pokemon pokemon = this.findEntityById(id);
        return this.mapToResponse(pokemon);
    }

    @Override
    public Page<PokemonResponseDto> findAll() {
        Page<Pokemon> pokemons = this.pokemonRepository.findAll(Pageable.unpaged());
        return pokemons.map(this::mapToResponse);
    }

    @Override
    public void delete(Long id) {
        Pokemon pokemon = this.findEntityById(id);
        this.pokemonRepository.delete(pokemon);
    }

    private Pokemon findEntityById(Long id) {
        return this.pokemonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pokemon não encontrado!!"));
    }

    private PokemonResponseDto mapToResponse(Pokemon pokemon) {
        PokemonResponseDto response = new PokemonResponseDto();
        BeanUtils.copyProperties(pokemon, response);
        return response;
    }
}
