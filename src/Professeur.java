// src/Professeur.java
public class Professeur {
    private String nom;

    public Professeur(String nom) {
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
        return "Professeur: " + nom;
    }
}