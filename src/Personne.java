import java.time.LocalDate;
import java.time.Period;

public class Personne {
    private Integer id;
    private String nom;
    private String prenom;
    private String ville;
    private LocalDate dateDeNaissance;

    public Personne(String nom, String prenom, String ville, LocalDate dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.dateDeNaissance = dateDeNaissance;
    }

    public void supprimer() {
        System.out.println("La personne " + this.nom + " a été supprimée.");
    }

    public int obtenirAge() {
        return Period.between(this.dateDeNaissance, LocalDate.now()).getYears();
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Ville : " + ville + ", Âge : " + obtenirAge());
    }
}
