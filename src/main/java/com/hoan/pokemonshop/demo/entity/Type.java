package com.hoan.pokemonshop.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class Type {

    @Id
    @Column(name = "type_id")
    private int id;

    @Column(name = "type_name")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
