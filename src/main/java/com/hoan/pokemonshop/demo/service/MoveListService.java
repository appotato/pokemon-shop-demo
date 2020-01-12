package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dto.PokemonDTO;
import com.hoan.pokemonshop.demo.dto.PokemonMoveDTO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonMove;

import java.util.List;

public interface MoveListService {
    public List<PokemonMoveDTO> findMoveByPokemonAndVersion(int pokemonId, int versionId);

    public List<PokemonDTO> findPokemonsByMoveAndVersion(int moveId, int versionId);
}
