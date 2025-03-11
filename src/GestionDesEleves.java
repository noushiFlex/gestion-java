import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDesEleves {
    static ArrayList<Eleve> eleves = new ArrayList<>();

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
                    ajouterEleve(scanner);
                    break;
                case 2:
                    supprimerEleve(scanner);
                    break;
                case 3:
                    modifierEleve(scanner);
                    break;
                case 4:
                    listerEleves();
                    break;
                case 5:
                    dernierEleve();
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

    public static void afficherMenu() {
        System.out.println("\n======== Menu Gestion des Élèves ========");
        System.out.println("1: Ajouter un élève");
        System.out.println("2: Supprimer un élève");
        System.out.println("3: Modifier un élève");
        System.out.println("4: Lister les élèves");
        System.out.println("5: Voir le dernier élève ajouté");
        System.out.println("0: Quitter");
        System.out.println("=========================================");
    }

    public static void ajouterEleve(Scanner scanner) {
        System.out.print("Entrez le nom de l'élève : ");
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
        System.out.print("Entrez la classe de l'élève : ");
        String classe = scanner.nextLine();

        Eleve eleve = new Eleve(nom, prenom, ville, LocalDate.of(annee, mois, jour), classe);
        eleves.add(eleve);
        System.out.println("✅ Élève ajouté avec succès !");
    }

    public static void supprimerEleve(Scanner scanner) {
        if (eleves.isEmpty()) {
            System.out.println("❌ Aucun élève à supprimer.");
            return;
        }
        listerEleves();
        System.out.print("Entrez l'index de l'élève à supprimer : ");
        int index = scanner.nextInt();
        if (index >= 0 && index < eleves.size()) {
            eleves.remove(index);
            System.out.println("✅ Élève supprimé !");
        } else {
            System.out.println("❌ Index invalide.");
        }
    }

    public static void modifierEleve(Scanner scanner) {
        if (eleves.isEmpty()) {
            System.out.println("❌ Aucun élève à modifier.");
            return;
        }
        listerEleves();
        System.out.print("Entrez l'index de l'élève à modifier : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < eleves.size()) {
            System.out.print("Entrez le nouveau nom : ");
            String nom = scanner.nextLine();
            System.out.print("Entrez le nouveau prénom : ");
            String prenom = scanner.nextLine();
            System.out.print("Entrez la nouvelle ville : ");
            String ville = scanner.nextLine();
            System.out.print("Entrez la nouvelle classe : ");
            String classe = scanner.nextLine();

            Eleve eleve = eleves.get(index);
            eleves.set(index, new Eleve(nom, prenom, ville, eleve.getDateDeNaissance(), classe));
            System.out.println("✅ Élève modifié !");
        } else {
            System.out.println("❌ Index invalide.");
        }
    }

    public static void listerEleves() {
        if (eleves.isEmpty()) {
            System.out.println("❌ Aucun élève enregistré.");
            return;
        }
        System.out.println("\n📋 Liste des élèves :");
        for (int i = 0; i < eleves.size(); i++) {
            System.out.print(i + " - ");
            eleves.get(i).afficherInfos();
        }
    }

    public static void dernierEleve() {
        if (eleves.isEmpty()) {
            System.out.println("❌ Aucun élève ajouté.");
            return;
        }
        System.out.println("\n📌 Dernier élève ajouté :");
        eleves.get(eleves.size() - 1).afficherInfos();
    }
}
