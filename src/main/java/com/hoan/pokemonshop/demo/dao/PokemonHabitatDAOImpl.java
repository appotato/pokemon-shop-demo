package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonHabitat;
import com.hoan.pokemonshop.demo.entity.PokemonMove;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PokemonHabitatDAOImpl implements PokemonHabitatDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<PokemonHabitat> findPokemonByHabitat(int habitatId) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<PokemonHabitat> query = currentSession.createQuery("from PokemonHabitat pb where pb.habitat.id=:habitatId");

        query.setParameter("habitatId", habitatId);

        return query.getResultList();
    }
}
