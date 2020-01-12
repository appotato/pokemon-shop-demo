package com.hoan.pokemonshop.demo.dto;

import com.hoan.pokemonshop.demo.entity.Ability;
import com.hoan.pokemonshop.demo.entity.BaseStat;
import com.hoan.pokemonshop.demo.entity.Characteristic;
import com.hoan.pokemonshop.demo.entity.Type;

import java.util.List;

public class PokemonDTO {

    private int id;

    private String name;

    private int height;

    private int weight;

    private int baseExp;

    private List<Type> types;

    private List<Ability> abilities;

    private Characteristic characteristic;

    private BaseStat baseStat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public void setBaseExp(int baseExp) {
        this.baseExp = baseExp;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public BaseStat getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(BaseStat baseStat) {
        this.baseStat = baseStat;
    }
}
