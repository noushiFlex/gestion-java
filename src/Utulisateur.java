
class Utilisateur {
    private Integer id;
    private String nom;
    private String motDePasse;

    // Constructeur pour initialiser les valeurs
    public Utilisateur(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    // Méthode pour vérifier l'authentification
    public boolean authentification() {
        return this.nom.equals("admin") && this.motDePasse.equals("admin");
    }
}
