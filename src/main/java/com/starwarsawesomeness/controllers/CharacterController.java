package com.starwarsawesomeness.controllers;

import com.starwarsawesomeness.dao.CharacterDao;
import com.starwarsawesomeness.models.CharacterModel;
import com.starwarsawesomeness.models.JediModel;
import com.starwarsawesomeness.models.SoldierModel;

import javax.ejb.EJB;
import javax.ws.rs.*;
import java.util.List;

@Path("users")
@Consumes("application/json")
@Produces("application/json")
public class CharacterController {

    @EJB
    private CharacterDao characterDao;

    @POST
    @Path("jedi")
    public void createJedi(JediModel jediModel) {
    }

    @POST
    @Path("soldier")
    public void create(SoldierModel soldierModel) {
    }

    @GET
    @Path("{id}")
    public CharacterModel read(@PathParam("id") Long id) {
        return null;
    }

    public List<CharacterModel> readAll() {
        return null;
    }

    public void update(CharacterModel c) {
    }

    public void remove(Long id) {
    }

}