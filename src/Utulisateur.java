class Utilisateur {
    private String nom;
    private String motDePasse;

    public Utilisateur(String nom, String motDePasse) {
        this.nom = nom;
        this.motDePasse = motDePasse;
    }

    public boolean authentification() {
        return this.nom.equals("admin") && this.motDePasse.equals("admin");
    }
}