package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pokemon_move_methods")
public class MoveMethod {

    @Id
    @Column(name = "method_id")
    private int id;

    @Column(name = "method_name")
    private String name;

    /*@OneToMany(mappedBy = "moveMethod")
    @JsonIgnore
    private List<PokemonMove> pokemonMoveList;*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*public List<PokemonMove> getPokemonMoveList() {
        return pokemonMoveList;
    }*/
}
