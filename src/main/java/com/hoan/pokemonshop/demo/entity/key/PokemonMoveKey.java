package com.hoan.pokemonshop.demo.entity.key;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PokemonMoveKey implements Serializable {

    @Column(name = "pok_id")
    private int pokId;

    @Column(name = "move_id")
    private int moveId;

    @Column(name = "version_group_id")
    private int versionId;

    @Column(name = "method_id")
    private int methodId;

    public int getPokId() {
        return pokId;
    }

    public int getMoveId() {
        return moveId;
    }

    public int getVersionId() {
        return versionId;
    }

    public int getMethodId() {
        return methodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonMoveKey that = (PokemonMoveKey) o;
        return pokId == that.pokId &&
                moveId == that.moveId &&
                versionId == that.versionId &&
                methodId == that.methodId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokId, moveId, versionId, methodId);
    }
}
