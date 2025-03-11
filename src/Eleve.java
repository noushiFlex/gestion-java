package src;

// src/Eleve.java
public class Eleve {
    private String nom;

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Élève: " + nom;
    }
}