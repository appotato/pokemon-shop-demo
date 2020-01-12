package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "moves")
public class Move extends RepresentationModel {

    @Id
    @Column(name = "move_id")
    private int id;

    @Column(name = "move_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @Column(name = "move_power")
    private Integer power;

    @Column(name = "move_pp")
    private int powerPoint;

    @Column(name = "move_accuracy")
    private Integer accuracy;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    public int getPowerPoint() {
        return powerPoint;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public Type getType() {
        return type;
    }
}
