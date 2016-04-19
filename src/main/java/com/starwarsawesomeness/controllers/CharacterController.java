package com.starwarsawesomeness.controllers;

import com.starwarsawesomeness.dao.CharacterDao;
import com.starwarsawesomeness.models.CharacterModel;
import com.starwarsawesomeness.models.JediModel;
import com.starwarsawesomeness.models.SoldierModel;

import javax.ejb.EJB;
import javax.ws.rs.*;
import java.util.List;

@Path("characters")
@Consumes("application/json")
@Produces("application/json")
public class CharacterController {

    @EJB
    private CharacterDao characterDao;

    @POST
    @Path("jedi")
    public void createJedi(JediModel jediModel) {
        characterDao.saveCharacter(jediModel);
    }

    @POST
    @Path("soldier")
    public void create(SoldierModel soldierModel) {
        characterDao.saveCharacter(soldierModel);
    }

    @GET
    @Path("{id}")
    public CharacterModel read(@PathParam("id") Long id) {
        return characterDao.readCharacter(id);
    }

    @GET
    @Path("jedis")
    public List readJedis() {
        return characterDao.getJedis();
    }

    @GET
    @Path("soldiers")
    public List readSoldiers() {
        return characterDao.getSoldiers();
    }

    public void update() {
    }

    public void remove(Long id) {
    }

}