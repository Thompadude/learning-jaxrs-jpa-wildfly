package com.starwarsawesomeness.models;

import com.starwarsawesomeness.models.enums.Affliation;
import com.starwarsawesomeness.models.enums.PhysicalStrength;
import com.starwarsawesomeness.models.enums.Race;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "characters")
@Inheritance
@DiscriminatorColumn(name = "role")
public abstract class CharacterModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String biograhpy;
    @Enumerated(value = EnumType.STRING)
    private Affliation affiliation;
    @Enumerated(value = EnumType.STRING)
    private PhysicalStrength physicalStrength;
    @Enumerated(value = EnumType.STRING)
    private Race race;

    public CharacterModel(String firstName, String lastName, String biograhpy, Affliation affiliation, PhysicalStrength physicalStrength, Race race) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.biograhpy = biograhpy;
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

    public String getBiograhpy() {
        return biograhpy;
    }

    public void setBiograhpy(String biograhpy) {
        this.biograhpy = biograhpy;
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