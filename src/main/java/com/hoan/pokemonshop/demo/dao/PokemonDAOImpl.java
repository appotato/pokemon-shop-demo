package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Pokemon;
import com.hoan.pokemonshop.demo.entity.PokemonType;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PokemonDAOImpl implements PokemonDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Pokemon> getPokemons() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Pokemon> query = currentSession.createQuery("from Pokemon", Pokemon.class);

        return query.getResultList();
    }

    @Override
    public Pokemon getPokemon( int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(Pokemon.class, id);
    }

    @Override
    @Transactional
    public List<PokemonType> getPokemonByType(int typeId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<PokemonType> query = currentSession.createQuery("from PokemonType pt where pt.type.id=:typeId");

        query.setParameter("typeId", typeId);

        return query.getResultList();
    }
}
