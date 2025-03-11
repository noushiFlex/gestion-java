import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Personne {

    private Integer id;
    private String nom;
    private String prenom;
    private String ville;
    private Date dateDeNaissance;

    public Personne(String nom, String prenom, String ville, Date dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.dateDeNaissance = dateDeNaissance;
    }
    public void supprimer() {
        System.out.println("La personne " + this.nom + " a été supprimée.");
    }

    public int obtenirAge() {
        Integer CurrentAge = 2025 - this.dateDeNaissance.getYear() ;
        return CurrentAge;
    }

}
