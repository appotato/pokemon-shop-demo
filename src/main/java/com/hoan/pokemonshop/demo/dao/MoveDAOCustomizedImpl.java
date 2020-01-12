package com.hoan.pokemonshop.demo.dao;

import com.hoan.pokemonshop.demo.entity.Move;
import com.hoan.pokemonshop.demo.entity.PokemonMove;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MoveDAOCustomizedImpl implements MoveDAOCustomized {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Move> findMoveByType(int typeId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Move> query = currentSession.createQuery("from Move m where m.type.id=:typeId");

        query.setParameter("typeId", typeId);

        return query.getResultList();
    }
}
