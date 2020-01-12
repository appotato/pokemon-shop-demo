package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.PokemonMove;

import java.util.List;

public interface MoveListDAO {

    public List<PokemonMove> findMoveListByPokemonAndVersion(int pokemonId, int versionId);

    public List<PokemonMove> findPokemonListByMoveAndVersion(int moveId, int versionId);
}
