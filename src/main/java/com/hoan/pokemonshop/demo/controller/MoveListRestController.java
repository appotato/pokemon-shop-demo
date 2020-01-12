package com.hoan.pokemonshop.demo.controller;

import com.hoan.pokemonshop.demo.dao.MoveListDAO;
import com.hoan.pokemonshop.demo.dto.PokemonMoveDTO;
import com.hoan.pokemonshop.demo.entity.PokemonMove;
import com.hoan.pokemonshop.demo.service.MoveListService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("/api/moveList")
public class MoveListRestController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MoveListService moveListService;

    @GetMapping("/{pokemonId}/{versionId}")
    public List<PokemonMoveDTO> getMoveList(@PathVariable int pokemonId, @PathVariable int versionId){
        return moveListService.findMoveByPokemonAndVersion(pokemonId, versionId);
    }

    private PokemonMoveDTO convertToDTO(PokemonMove pokemonMove){
        PokemonMoveDTO pokemonMoveDTO = modelMapper.map(pokemonMove, PokemonMoveDTO.class);
        return pokemonMoveDTO;
    }
}
