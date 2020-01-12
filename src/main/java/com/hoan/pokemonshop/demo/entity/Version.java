package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "version_groups")
public class Version {

    @Id
    @Column(name = "version_id")
    private int id;

    @Column(name = "version_name")
    private String name;

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
