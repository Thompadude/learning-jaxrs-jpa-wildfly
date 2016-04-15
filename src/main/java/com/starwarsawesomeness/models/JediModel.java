package com.starwarsawesomeness.models;

import com.starwarsawesomeness.models.enums.Affliation;
import com.starwarsawesomeness.models.enums.PhysicalStrength;
import com.starwarsawesomeness.models.enums.Race;
import com.starwarsawesomeness.models.enums.Rank;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "jedi")
public class JediModel extends CharacterModel {

    @Enumerated(value = EnumType.STRING)
    private Rank rank;

    public JediModel(String firstName, String lastName, String biograhpy, Affliation affiliation, PhysicalStrength physicalStrength, Race race, Rank rank) {
        super(firstName, lastName, biograhpy, affiliation, physicalStrength, race);
        this.rank = rank;
    }

    public JediModel() {
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}