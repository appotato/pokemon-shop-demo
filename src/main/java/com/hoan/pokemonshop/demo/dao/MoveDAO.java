package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Move;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoveDAO extends JpaRepository<Move, Integer>, MoveDAOCustomized {
}
