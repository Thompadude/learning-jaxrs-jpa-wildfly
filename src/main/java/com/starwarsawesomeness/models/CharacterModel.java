package com.starwarsawesomeness.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.starwarsawesomeness.models.enums.Affliation;
import com.starwarsawesomeness.models.enums.PhysicalStrength;
import com.starwarsawesomeness.models.enums.Race;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorColumn(name = "role")
@Table(name = "characters")
@Inheritance
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CharacterModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String biography;
    @Enumerated(value = EnumType.STRING)
    private Affliation affiliation;
    @Enumerated(value = EnumType.STRING)
    private PhysicalStrength physicalStrength;
    @Enumerated(value = EnumType.STRING)
    private Race race;

    public CharacterModel(String firstName, String lastName, String biography, Affliation affiliation, PhysicalStrength physicalStrength, Race race) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
        this.affiliation = affiliation;
        this.physicalStrength = physicalStrength;
        this.race = race;
    }

    public CharacterModel() {
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Affliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affliation affiliation) {
        this.affiliation = affiliation;
    }

    public PhysicalStrength getPhysicalStrength() {
        return physicalStrength;
    }

    public void setPhysicalStrength(PhysicalStrength physicalStrength) {
        this.physicalStrength = physicalStrength;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

}