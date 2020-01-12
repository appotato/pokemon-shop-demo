package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dto.PokemonDTO;
import com.hoan.pokemonshop.demo.entity.Pokemon;

import java.util.List;

public interface PokemonHabitatService {
    public List<PokemonDTO> findPokemonByHabitat(int habitatId);
}
