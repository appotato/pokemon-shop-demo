package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.controller.MoveRestController;
import com.hoan.pokemonshop.demo.dao.MoveListDAO;
import com.hoan.pokemonshop.demo.dto.PokemonDTO;
import com.hoan.pokemonshop.demo.dto.PokemonMoveDTO;
import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonMove;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Service
public class MoveListServiceImpl implements MoveListService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MoveListDAO moveListDAO;

    @Override
    @Transactional
    public List<PokemonMoveDTO> findMoveByPokemonAndVersion(int pokemonId, int versionId) {
        List<PokemonMove> pokemonMoveList = findMoveListByPokemonAndVersion(pokemonId, versionId);

        List<PokemonMoveDTO> moveListDTO = new LinkedList<>();

        for(PokemonMove move : pokemonMoveList){
            Link link = linkTo(MoveRestController.class).slash(move.getMove().getId()).withSelfRel();
            move.getMove().add(link);
            moveListDTO.add(convertToDTO(move));
        }

        return moveListDTO;
    }


    public List<PokemonMove> findMoveListByPokemonAndVersion(int pokemonId, int versionId) {
        return moveListDAO.findMoveListByPokemonAndVersion(pokemonId, versionId);
    }


    @Override
    @Transactional
    public List<PokemonDTO> findPokemonsByMoveAndVersion(int moveId, int versionId) {
        List<PokemonMove> pokemonMoveList = findPokemonMoveListByMoveAndVersion(moveId, versionId);

        List<PokemonDTO> pokemonDTOList = new LinkedList<>();

        for (PokemonMove pokemonMove : pokemonMoveList){
            pokemonDTOList.add(convertToDTO(pokemonMove.getPokemon()));
        }

        return pokemonDTOList;
    }


    public List<PokemonMove> findPokemonMoveListByMoveAndVersion(int moveId, int versionId) {
        return moveListDAO.findPokemonListByMoveAndVersion(moveId, versionId);
    }

    private PokemonDTO convertToDTO(Pokemon pokemon){
        PokemonDTO pokemonDTO = modelMapper.map(pokemon, PokemonDTO.class);
        return pokemonDTO;
    }

    private PokemonMoveDTO convertToDTO(PokemonMove pokemonMove){
        PokemonMoveDTO pokemonMoveDTO = modelMapper.map(pokemonMove, PokemonMoveDTO.class);
        return pokemonMoveDTO;
    }
}
