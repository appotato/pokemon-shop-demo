package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dao.PokemonDAO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonDAO pokemonDAO;


    @Override
    @Transactional
    public List<Pokemon> getPokemons() {
        return pokemonDAO.getPokemons();
    }

    @Override
    @Transactional
    public Pokemon getPokemon(int id) {
        return pokemonDAO.getPokemon(id);
    }
}
