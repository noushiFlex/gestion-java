import java.util.ArrayList;
import java.util.Scanner;

class Eleve {
    private String nom;
   public int age;

    public Eleve(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Age: " + age;
    }
}

public class GestionEleves {
    private static final ArrayList<Eleve> listeEleves = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterEleve();
                    break;
                case 2:
                    supprimerEleve();
                    break;
                case 3:
                    modifierEleve();
                    break;
                case 4:
                    listerEleves();
                    break;
                case 5:
                    obtenirDernierEleve();
                    break;
                case 6:
                    System.out.println("Retour au menu principal...");
                    break;
                case 7:
                    System.out.println("Merci d'avoir utilisé l'application. Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("====================================");
        System.out.println("  BIENVENUE DANS L’APPLICATION ETAB v1.1  ");
        System.out.println("====================================");
        System.out.println("1. Ajouter un élève");
        System.out.println("2. Supprimer un élève");
        System.out.println("3. Modifier les informations d’un élève");
        System.out.println("4. Lister les élèves");
        System.out.println("5. Obtenir le dernier élève ajouté");
        System.out.println("6. Retour");
        System.out.println("7. Quitter");
        System.out.print("Votre choix: ");
    }

    private static void ajouterEleve() {
        System.out.print("Nom de l'élève: ");
        String nom = scanner.nextLine();
        System.out.print("Âge de l'élève: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        listeEleves.add(new Eleve(nom, age));
        System.out.println("Élève ajouté avec succès !");
    }

    private static void supprimerEleve() {
        System.out.print("Nom de l'élève à supprimer: ");
        String nom = scanner.nextLine();
        listeEleves.removeIf(eleve -> eleve.getNom().equalsIgnoreCase(nom));
        System.out.println("Élève supprimé (si trouvé).");
    }

    private static void modifierEleve() {
        System.out.print("Nom de l'élève à modifier: ");
        String nom = scanner.nextLine();
        for (Eleve eleve : listeEleves) {
            if (eleve.getNom().equalsIgnoreCase(nom)) {
                System.out.print("Nouveau nom: ");
                eleve.setNom(scanner.nextLine());
                System.out.print("Nouvel âge: ");
                eleve.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Informations mises à jour.");
                return;
            }
        }
        System.out.println("Élève non trouvé.");
    }

    private static void listerEleves() {
        if (listeEleves.isEmpty()) {
            System.out.println("Aucun élève enregistré.");
        } else {
            System.out.println("Liste des élèves :");
            for (Eleve eleve : listeEleves) {
                System.out.println(eleve);
            }
        }
    }

    private static void obtenirDernierEleve() {
        if (listeEleves.isEmpty()) {
            System.out.println("Aucun élève enregistré.");
        } else {
            System.out.println("Dernier élève ajouté : " + listeEleves.get(listeEleves.size() - 1));
        }
    }
}
