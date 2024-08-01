package br.com.futurodev.pokedex.repository;
import br.com.futurodev.pokedex.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
