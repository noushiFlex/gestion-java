import java.time.LocalDate;

public class Eleve extends Personne {
    private String classe;

    public Eleve(String nom, String prenom, String ville, LocalDate dateDeNaissance, String classe) {
        super(nom, prenom, ville, dateDeNaissance);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Classe : " + classe);
    }

    public LocalDate getDateDeNaissance(){
        return this.getDateDeNaissance();
    }
}
