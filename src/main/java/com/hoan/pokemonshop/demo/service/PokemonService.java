package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dao.PokemonDAO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PokemonService {

    public List<Pokemon> getPokemons();

    public Pokemon getPokemon(int id);
}
