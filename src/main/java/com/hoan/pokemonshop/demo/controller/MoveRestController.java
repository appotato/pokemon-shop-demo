package com.hoan.pokemonshop.demo.controller;

import com.hoan.pokemonshop.demo.dao.MoveDAO;
import com.hoan.pokemonshop.demo.entity.Move;
import com.hoan.pokemonshop.demo.service.MoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/moves")
public class MoveRestController {

    @Autowired
    private MoveService moveService;

    @GetMapping("/{moveId}")
    public Move findMoveById(@PathVariable int moveId){
        return moveService.findMoveById(moveId);
    }

    @GetMapping("")
    public List<Move> findAllMoves(){
        return moveService.findAllMoves();
    }

    @GetMapping("/type/{typeId}")
    public List<Move> findMoveByType(@PathVariable  int typeId){

        List<Move> moveList = moveService.findMoveByType(typeId);

        return moveList;
    }
}
