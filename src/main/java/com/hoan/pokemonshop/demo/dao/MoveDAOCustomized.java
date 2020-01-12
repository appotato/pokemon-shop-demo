package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Move;

import java.util.List;

public interface MoveDAOCustomized {
    public List<Move> findMoveByType(int typeId);
}
