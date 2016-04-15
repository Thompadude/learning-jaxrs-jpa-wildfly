package com.starwarsawesomeness.models;

import com.starwarsawesomeness.models.enums.Weapon;
import com.starwarsawesomeness.models.enums.Affliation;
import com.starwarsawesomeness.models.enums.PhysicalStrength;
import com.starwarsawesomeness.models.enums.Race;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("soldier")
public class SoldierModel extends CharacterModel {

    @Enumerated(EnumType.STRING)
    private Weapon weapon;

    public SoldierModel(String firstName, String lastName, String biograhpy, Affliation affiliation, PhysicalStrength physicalStrength, Race race, Weapon weapon) {
        super(firstName, lastName, biograhpy, affiliation, physicalStrength, race);
        this.weapon = weapon;
    }

    public SoldierModel() {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}