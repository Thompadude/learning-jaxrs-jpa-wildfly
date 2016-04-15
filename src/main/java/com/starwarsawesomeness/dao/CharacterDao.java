package com.starwarsawesomeness.dao;

import com.starwarsawesomeness.models.CharacterModel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CharacterDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveCharacter(CharacterModel c) {
        entityManager.persist(c);
    }

}