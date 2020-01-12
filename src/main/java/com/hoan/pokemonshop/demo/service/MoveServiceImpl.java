package com.hoan.pokemonshop.demo.service;

import com.hoan.pokemonshop.demo.dao.MoveDAO;
import com.hoan.pokemonshop.demo.entity.Move;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MoveServiceImpl implements MoveService {
    @Autowired
    private MoveDAO moveDAO;

    @Override
    public Move findMoveById(int moveId) {
        return moveDAO.findById(moveId).orElse(null);
    }

    @Override
    public List<Move> findAllMoves() {
        return moveDAO.findAll();
    }

    @Override
    @Transactional
    public List<Move> findMoveByType(int typeId) {
        return moveDAO.findMoveByType(typeId);
    }
}
