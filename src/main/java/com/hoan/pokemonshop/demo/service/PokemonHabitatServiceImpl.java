package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dao.PokemonHabitatDAO;
import com.hoan.pokemonshop.demo.dto.PokemonDTO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonHabitat;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class PokemonHabitatServiceImpl implements PokemonHabitatService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PokemonHabitatDAO pokemonHabitatDAO;

    @Override
    @Transactional
    public List<PokemonDTO> findPokemonByHabitat(int habitatId) {

        List<PokemonHabitat> pokemonHabitatList = pokemonHabitatDAO.findPokemonByHabitat(habitatId);

        List<PokemonDTO> pokemonDTOList = new LinkedList<>();

        for (PokemonHabitat pokemonHabitat : pokemonHabitatList){
            pokemonDTOList.add(convertToDTO(pokemonHabitat.getPokemon()));
        }

        return pokemonDTOList;
    }

    private PokemonDTO convertToDTO(Pokemon pokemon){
        PokemonDTO pokemonDTO = modelMapper.map(pokemon, PokemonDTO.class);
        return pokemonDTO;
    }
}
