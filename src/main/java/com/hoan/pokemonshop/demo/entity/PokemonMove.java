package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hoan.pokemonshop.demo.entity.key.PokemonMoveKey;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_moves")
public class PokemonMove {

    @EmbeddedId
    private PokemonMoveKey id;

    @ManyToOne
    @MapsId("pok_id")
    @JoinColumn(name = "pok_id")
    private Pokemon pokemon;

    @ManyToOne
    @MapsId("move_id")
    @JoinColumn(name = "move_id")
    private Move move;

    @ManyToOne
    @MapsId("version_group_id")
    @JoinColumn(name = "version_group_id")
    private Version version;

    @ManyToOne
    @MapsId("method_id")
    @JoinColumn(name = "method_id")
    private MoveMethod moveMethod;

    public PokemonMoveKey getId() {
        return id;
    }

    public Move getMove() {
        return move;
    }

    public Version getVersion() {
        return version;
    }

    public MoveMethod getMoveMethod() {
        return moveMethod;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}
