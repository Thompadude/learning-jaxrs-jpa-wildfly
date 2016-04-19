package com.starwarsawesomeness.dao;

import com.starwarsawesomeness.models.CharacterModel;
import com.starwarsawesomeness.models.JediModel;
import com.starwarsawesomeness.models.SoldierModel;

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

    public List getSoldiers() {
        List<SoldierModel> soldierModelList;
        soldierModelList = entityManager.createNamedQuery("Soldier.findAll", SoldierModel.class).getResultList();
        return soldierModelList;
    }

    public CharacterModel readCharacter(Long id) {
        CharacterModel characterModel;
        characterModel = entityManager.find(CharacterModel.class, id);
        return characterModel;
    }

}