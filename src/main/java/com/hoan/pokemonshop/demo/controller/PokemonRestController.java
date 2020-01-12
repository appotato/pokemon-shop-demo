package com.hoan.pokemonshop.demo.controller;

import com.hoan.pokemonshop.demo.dao.PokemonDAO;
import com.hoan.pokemonshop.demo.dao.PokemonHabitatDAO;
import com.hoan.pokemonshop.demo.dto.PokemonDTO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonHabitat;
import com.hoan.pokemonshop.demo.entity.PokemonType;
import com.hoan.pokemonshop.demo.service.MoveListService;
import com.hoan.pokemonshop.demo.service.PokemonHabitatService;
import com.hoan.pokemonshop.demo.service.PokemonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonRestController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private MoveListService moveListService;

    @Autowired
    private PokemonHabitatService pokemonHabitatService;

    @Autowired
    private PokemonDAO pokemonDAO;

    @GetMapping("/")
    public List<Pokemon> getPokemons(){
        return pokemonService.getPokemons();
    }

    @GetMapping("/{id}")
    public PokemonDTO getPokemon(@PathVariable int id){
        Pokemon pokemon = pokemonService.getPokemon(id);
        return convertToDto(pokemon);
    }

    @GetMapping("/{moveId}/{versionId}")
    public List<PokemonDTO> getPokemonByMoveAndVersion(@PathVariable int moveId, @PathVariable int versionId){
        return moveListService.findPokemonsByMoveAndVersion(moveId, versionId);
    }

    @GetMapping("/habitat/{habitatId}")
    public List<PokemonDTO> getPokemonByHabitat(@PathVariable int habitatId){
        return pokemonHabitatService.findPokemonByHabitat((habitatId));
    }

    @GetMapping("/type/{typeId}")
    public List<PokemonType> getPokemonByType(@PathVariable int typeId){
        return pokemonDAO.getPokemonByType(typeId);
    }

    private PokemonDTO convertToDto(Pokemon pokemon){
        PokemonDTO pokemonDTO = modelMapper.map(pokemon, PokemonDTO.class);
        return pokemonDTO;
    }
}
