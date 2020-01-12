package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonHabitat;

import java.util.List;

public interface PokemonHabitatDAO {
    public List<PokemonHabitat> findPokemonByHabitat(int habitatId);
}
