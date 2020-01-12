package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "abilities")
public class Ability {

    @Id
    @Column(name = "abil_id")
    private int id;

    @Column(name = "abil_name")
    private String name;

    /*@ManyToMany(mappedBy = "abilities")
    @JsonIgnore
    private List<Pokemon> pokemonsThatHave;*/

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
