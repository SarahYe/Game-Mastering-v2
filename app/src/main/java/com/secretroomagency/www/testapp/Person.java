package com.secretroomagency.www.testapp;

/**
 * Created by Sarah on 16/06/2017.
 */

public class Person {

    public int id;
    public String nom;
    public String prenom;

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
