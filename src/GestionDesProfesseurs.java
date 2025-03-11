import java.util.ArrayList;
import java.util.Scanner;

public class GestionDesProfesseurs {
    static ArrayList<String> professeurs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        // Boucle pour afficher le menu jusqu'à ce que l'utilisateur choisisse de quitter
        do {
            afficherMenu();
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne (entrée après un entier)

            // Traitement du choix de l'utilisateur
            switch (choix) {
                case 1:
                    ajouterProfesseur(scanner);
                    break;
                case 2:
                    supprimerProfesseur(scanner);
                    break;
                case 3:
                    modifierProfesseur(scanner);
                    break;
                case 4:
                    listerProfesseurs();
                    break;
                case 5:
                    dernierProfesseur();
                    break;
                case 6:
                    System.out.println("Retour...");
                    break;
                case 0:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0); // Continue jusqu'à ce que l'utilisateur choisisse 0 pour quitter

        scanner.close(); // Fermer le scanner à la fin
    }

    // Afficher le menu
    public static void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1: Ajouter un professeur");
        System.out.println("2: Supprimer un professeur");
        System.out.println("3: Modifier les informations du professeur");
        System.out.println("4: Lister les professeurs");
        System.out.println("5: Obtenir le dernier professeur ajouté");
        System.out.println("6: Retour");
        System.out.println("0: Accueil");
    }

    // Ajouter un professeur
    public static void ajouterProfesseur(Scanner scanner) {
        System.out.print("Entrez le nom du professeur à ajouter : ");
        String nom = scanner.nextLine();
        professeurs.add(nom);
        System.out.println("Professeur ajouté : " + nom);
    }

    // Supprimer un professeur
    public static void supprimerProfesseur(Scanner scanner) {
        System.out.print("Entrez le nom du professeur à supprimer : ");
        String nom = scanner.nextLine();
        if (professeurs.remove(nom)) {
            System.out.println("Professeur supprimé : " + nom);
        } else {
            System.out.println("Professeur non trouvé.");
        }
    }

    // Modifier les informations d'un professeur
    public static void modifierProfesseur(Scanner scanner) {
        System.out.print("Entrez le nom du professeur à modifier : ");
        String nom = scanner.nextLine();
        if (professeurs.contains(nom)) {
            System.out.print("Entrez le nouveau nom du professeur : ");
            String nouveauNom = scanner.nextLine();
            professeurs.set(professeurs.indexOf(nom), nouveauNom);
            System.out.println("Professeur modifié : " + nouveauNom);
        } else {
            System.out.println("Professeur non trouvé.");
        }
    }

    // Lister les professeurs
    public static void listerProfesseurs() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur dans la liste.");
        } else {
            System.out.println("Liste des professeurs :");
            for (String professeur : professeurs) {
                System.out.println(professeur);
            }
        }
    }

    // Obtenir le dernier professeur ajouté
    public static void dernierProfesseur() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur ajouté.");
        } else {
            System.out.println("Dernier professeur ajouté : " + professeurs.get(professeurs.size() - 1));
        }
    }
}

