import java.time.LocalDate;

public class Professeur extends Personne {
    private boolean vacant;

    public Professeur(String nom, String prenom, String ville, LocalDate dateDeNaissance, boolean vacant) {
        super(nom, prenom, ville, dateDeNaissance); // Appel du constructeur de Personne
        this.vacant = vacant;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public LocalDate getDateDeNaissance(){
        return this.getDateDeNaissance();
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Vacant : " + (vacant ? "Oui" : "Non"));
    }
}
