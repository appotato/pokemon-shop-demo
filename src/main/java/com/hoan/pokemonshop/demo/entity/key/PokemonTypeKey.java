package com.hoan.pokemonshop.demo.entity.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PokemonTypeKey implements Serializable {

    @Column(name = "pok_id")
    private int pokemonId;

    @Column(name = "type_id")
    private int typeId;

    public int getPokemonId() {
        return pokemonId;
    }

    public int getTypeId() {
        return typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonTypeKey that = (PokemonTypeKey) o;
        return pokemonId == that.pokemonId &&
                typeId == that.typeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, typeId);
    }
}
