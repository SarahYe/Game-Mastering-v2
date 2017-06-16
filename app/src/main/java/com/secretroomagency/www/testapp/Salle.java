package com.secretroomagency.www.testapp;

/**
 * Created by Sarah on 15/06/2017.
 */

public class Salle {
    public int id;
    public String nom;
    public String description;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
