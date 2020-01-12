package com.hoan.pokemonshop.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_habitats")
public class Habitat {

    @Id
    @Column(name = "hab_id")
    private int id;

    @Column(name = "hab_name")
    private String name;

    @Column(name = "hab_descript")
    private String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
