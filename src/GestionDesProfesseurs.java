import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDesProfesseurs {
    static ArrayList<Professeur> professeurs = new ArrayList<>();

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            afficherMenu();
            System.out.print("Choisissez une option : ");
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un nombre valide !");
                scanner.next();
            }
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne

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
                case 0:
                    System.out.println("Retour au menu principal.");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0);

        scanner.close();
    }

    // Afficher le menu
    public static void afficherMenu() {
        System.out.println("\n======== Menu Gestion des Professeurs ========");
        System.out.println("1: Ajouter un professeur");
        System.out.println("2: Supprimer un professeur");
        System.out.println("3: Modifier un professeur");
        System.out.println("4: Lister les professeurs");
        System.out.println("5: Voir le dernier professeur ajouté");
        System.out.println("0: Quitter");
        System.out.println("==============================================");
    }

    // Ajouter un professeur
    public static void ajouterProfesseur(Scanner scanner) {
        System.out.print("Entrez le nom du professeur : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez la ville : ");
        String ville = scanner.nextLine();
        System.out.print("Entrez l'année de naissance : ");
        int annee = scanner.nextInt();
        System.out.print("Entrez le mois de naissance (1-12) : ");
        int mois = scanner.nextInt();
        System.out.print("Entrez le jour de naissance : ");
        int jour = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne
        System.out.print("Le professeur est-il vacant ? (true/false) : ");
        boolean vacant = scanner.nextBoolean();

        Professeur prof = new Professeur(nom, prenom, ville, LocalDate.of(annee, mois, jour), vacant);
        professeurs.add(prof);
        System.out.println("✅ Professeur ajouté avec succès !");
    }

    // Supprimer un professeur
    public static void supprimerProfesseur(Scanner scanner) {
        if (professeurs.isEmpty()) {
            System.out.println("❌ Aucun professeur à supprimer.");
            return;
        }
        listerProfesseurs();
        System.out.print("Entrez l'index du professeur à supprimer : ");
        int index = scanner.nextInt();
        if (index >= 0 && index < professeurs.size()) {
            professeurs.remove(index);
            System.out.println("✅ Professeur supprimé !");
        } else {
            System.out.println("❌ Index invalide.");
        }
    }

    // Modifier un professeur
    public static void modifierProfesseur(Scanner scanner) {
        if (professeurs.isEmpty()) {
            System.out.println("❌ Aucun professeur à modifier.");
            return;
        }
        listerProfesseurs();
        System.out.print("Entrez l'index du professeur à modifier : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < professeurs.size()) {
            System.out.print("Entrez le nouveau nom : ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le nouveau prénom : ");
            String prenom = scanner.nextLine();
            System.out.print("Entrez la nouvelle ville : ");
            String ville = scanner.nextLine();
            System.out.print("Le professeur est-il vacant ? (true/false) : ");
            boolean vacant = scanner.nextBoolean();

            Professeur prof = professeurs.get(index);
            professeurs.set(index, new Professeur(nom, prenom, ville, prof.getDateDeNaissance(), vacant));
            System.out.println("✅ Professeur modifié !");
        } else {
            System.out.println("❌ Index invalide.");
        }
    }

    // Lister les professeurs
    public static void listerProfesseurs() {
        if (professeurs.isEmpty()) {
            System.out.println("❌ Aucun professeur enregistré.");
            return;
        }
        System.out.println("\n📋 Liste des professeurs :");
        for (int i = 0; i < professeurs.size(); i++) {
            System.out.print(i + " - ");
            professeurs.get(i).afficherInfos();
        }
    }

    // Voir le dernier professeur ajouté
    public static void dernierProfesseur() {
        if (professeurs.isEmpty()) {
            System.out.println("❌ Aucun professeur ajouté.");
            return;
        }
        System.out.println("\n📌 Dernier professeur ajouté :");
        professeurs.get(professeurs.size() - 1).afficherInfos();
    }
}
