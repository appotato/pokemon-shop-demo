package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hoan.pokemonshop.demo.entity.key.PokemonHabitatKey;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_characteristics")
public class PokemonHabitat {

    @EmbeddedId
    @JsonIgnore
    private PokemonHabitatKey id;

    @OneToOne
    @MapsId("pok_id")
    @JoinColumn(name = "pok_id")
    private Pokemon pokemon;

    @ManyToOne
    @MapsId("hab_id")
    @JoinColumn(name = "hab_id")
    private Habitat habitat;

    public PokemonHabitatKey getId() {
        return id;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Habitat getHabitat() {
        return habitat;
    }
}
