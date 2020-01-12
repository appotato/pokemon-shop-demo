package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hoan.pokemonshop.demo.entity.key.PokemonHabitatKey;
import com.hoan.pokemonshop.demo.entity.key.PokemonTypeKey;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_types")
public class PokemonType {

    @EmbeddedId
    @JsonIgnore
    private PokemonTypeKey id;

    @ManyToOne
    @MapsId("pok_id")
    @JoinColumn(name = "pok_id")
    private Pokemon pokemon;

    @ManyToOne
    @MapsId("type_id")
    @JoinColumn(name = "type_id")
    private Type type;

    public PokemonTypeKey getId() {
        return id;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Type getType() {
        return type;
    }
}
