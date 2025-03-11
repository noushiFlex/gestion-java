import java.util.ArrayList;
import java.util.Scanner;

// Classe de base Personne
class Personne {
    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}