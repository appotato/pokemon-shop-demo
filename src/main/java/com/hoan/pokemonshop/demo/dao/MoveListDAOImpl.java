package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.PokemonMove;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MoveListDAOImpl implements MoveListDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<PokemonMove> findMoveListByPokemonAndVersion(int pokemonId, int versionId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<PokemonMove> query = currentSession.createQuery("from PokemonMove pm where pm.pokemon.id=:pokemonId and pm.version.id=:versionId");

        query.setParameter("pokemonId", pokemonId);
        query.setParameter("versionId", versionId);

        return query.getResultList();
    }

    @Override
    public List<PokemonMove> findPokemonListByMoveAndVersion(int moveId, int versionId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<PokemonMove> query = currentSession.createQuery("from PokemonMove pm where pm.move.id=:moveId and pm.version.id=:versionId");

        query.setParameter("moveId", moveId);
        query.setParameter("versionId", versionId);

        return query.getResultList();
    }


}
