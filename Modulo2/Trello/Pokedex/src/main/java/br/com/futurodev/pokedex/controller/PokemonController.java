package br.com.futurodev.pokedex.controller;

import br.com.futurodev.pokedex.dto.PokemonRequestDto;
import br.com.futurodev.pokedex.dto.PokemonResponseDto;
import br.com.futurodev.pokedex.service.interfaces.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("Insomnia")
public class PokemonController {
    private final PokemonService pokemonService;

    @PostMapping()
    public PokemonResponseDto create(@RequestBody PokemonRequestDto dto) {
        return pokemonService.create(dto);
    }

    @PutMapping("{id}")
    public PokemonResponseDto update(@PathVariable Long id, @RequestBody PokemonRequestDto dto) {
        return pokemonService.update(id, dto);
    }

    @GetMapping
    public Page<PokemonResponseDto> findAll() {
        return pokemonService.findAll();
    }

    @GetMapping("{id}")
    public PokemonResponseDto findById(@PathVariable Long id) {
        return pokemonService.findById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        pokemonService.delete(id);
    }

}
