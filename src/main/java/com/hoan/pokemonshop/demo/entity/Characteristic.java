package com.hoan.pokemonshop.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "pokemon_characteristics")
public class Characteristic {

    @Id
    @Column(name = "pok_id")
    private int pok_id;

    @Column(name = "evolves_from_species_id")
    private Integer evolveFromId;

    @Column(name = "evolves_to_species_id")
    private Integer evolveToId;

    @OneToOne
    @JoinColumn(name = "hab_id")
    private Habitat habitat;

    @Column(name = "gender_rate")
    private int genderRate;

    @Column(name = "capture_rate")
    private int captureRate;

    @Column(name = "base_happiness")
    private int baseHappiness;

    public int getPok_id() {
        return pok_id;
    }

    public Integer getEvolveFromId() {
        return evolveFromId;
    }

    public Integer getEvolveToId() {
        return evolveToId;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public int getGenderRate() {
        return genderRate;
    }

    public int getCaptureRate() {
        return captureRate;
    }

    public int getBaseHappiness() {
        return baseHappiness;
    }
}
