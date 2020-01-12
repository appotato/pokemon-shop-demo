package com.hoan.pokemonshop.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "base_stats")
public class BaseStat {

    @Id
    @Column(name = "pok_id")
    @JsonIgnore
    private int id;

    @Column(name = "b_hp")
    private int baseHP;

    @Column(name = "b_atk")
    private int baseAttack;

    @Column(name = "b_def")
    private int baseDefennse;

    @Column(name = "b_sp_atk")
    private int baseSpecialAttack;

    @Column(name = "b_sp_def")
    private int baseSpecialDefense;

    @Column(name = "b_speed")
    private int baseSpeed;

    public int getId() {
        return id;
    }

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefennse() {
        return baseDefennse;
    }

    public int getBaseSpecialAttack() {
        return baseSpecialAttack;
    }

    public int getBaseSpecialDefense() {
        return baseSpecialDefense;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }
}
