package com.hoan.pokemonshop.demo.entity;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pokemon")
public class Pokemon extends RepresentationModel {
    @Id
    @Column(name = "pok_id")
    private int id;

    @Column(name = "pok_name")
    private String name;

    @Column(name = "pok_height")
    private int height;

    @Column(name = "pok_weight")
    private int weight;

    @Column(name = "pok_base_experience")
    private int baseExp;

    @ManyToMany
    @JoinTable(
            name = "pokemon_types",
            joinColumns = @JoinColumn(name = "pok_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private List<Type> types;

    @ManyToMany
    @JoinTable(
            name = "pokemon_abilities",
            joinColumns = @JoinColumn(name = "pok_id"),
            inverseJoinColumns = @JoinColumn(name = "abil_id")
    )
    private List<Ability> abilities;

    @OneToOne
    @JoinColumn(name = "pok_id")
    private Characteristic characteristic;

    @OneToOne
    @JoinColumn(name = "pok_id")
    private BaseStat baseStat;

    /*@OneToMany(mappedBy = "pokemon")
    @OrderBy("id.versionId ASC, id.moveId ASC")
    private List<PokemonMove> pokemonMoveList;*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBaseExp() {
        return baseExp;
    }

    public List<Type> getTypes() {
        return types;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public BaseStat getBaseStat() {
        return baseStat;
    }

    /*public List<PokemonMove> getPokemonMoveList() {
        return pokemonMoveList;
    }*/

}
