package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.entity.Move;

import java.util.List;

public interface MoveService {

    public Move findMoveById(int moveId);

    public List<Move> findAllMoves();

    public List<Move> findMoveByType(int typeId);
}
