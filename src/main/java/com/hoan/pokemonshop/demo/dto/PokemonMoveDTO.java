package com.hoan.pokemonshop.demo.dto;

import com.hoan.pokemonshop.demo.entity.Move;
import com.hoan.pokemonshop.demo.entity.MoveMethod;

public class PokemonMoveDTO {

    private Move move;

    private MoveMethod moveMethod;

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public MoveMethod getMoveMethod() {
        return moveMethod;
    }

    public void setMoveMethod(MoveMethod moveMethod) {
        this.moveMethod = moveMethod;
    }
}
