package com.hoan.pokemonshop.demo.entity.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PokemonHabitatKey implements Serializable {

    @Column(name = "pok_id")
    private int pokemonId;

    @Column(name = "hab_id")
    private int habitatId;

    public int getPokemonId() {
        return pokemonId;
    }

    public int getHabitatId() {
        return habitatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonHabitatKey that = (PokemonHabitatKey) o;
        return pokemonId == that.pokemonId &&
                habitatId == that.habitatId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, habitatId);
    }
}
