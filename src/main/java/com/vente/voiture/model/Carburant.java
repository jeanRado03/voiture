package com.vente.voiture.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carburant {
    @Id
    @Column(name = "id_carburant", nullable = false)
    private String id_carburant;
    private String nom_carburant;

    public Carburant() {
    }

    public String getNom_carburant() {
        return nom_carburant;
    }

    public void setNom_carburant(String nom_carburant) {
        this.nom_carburant = nom_carburant;
    }

    public String getId_carburant() {
        return id_carburant;
    }

    public void setId_carburant(String id_carburant) {
        this.id_carburant = id_carburant;
    }

    public Carburant(String id_carburant, String nom_carburant) {
        this.setId_carburant(id_carburant);
        this.setNom_carburant(nom_carburant);
    }

    public Carburant(String nom_carburant) {
        this.setNom_carburant(nom_carburant);
    }

}
