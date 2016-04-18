package com.starwarsawesomeness.dao;

import com.starwarsawesomeness.models.CharacterModel;
import com.starwarsawesomeness.models.JediModel;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CharacterDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveCharacter(CharacterModel c) {
        entityManager.persist(c);
    }

    public List getJedis() {
        List<JediModel> jediModelList;
        jediModelList = entityManager.createNamedQuery("Jedi.findAll", JediModel.class).getResultList();
        return jediModelList;
    }

}