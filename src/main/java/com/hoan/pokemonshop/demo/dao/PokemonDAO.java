package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonType;

import java.util.List;

public interface PokemonDAO {
    public List<Pokemon> getPokemons();

    public Pokemon getPokemon(int id);

    public List<PokemonType> getPokemonByType(int typeId);
}
