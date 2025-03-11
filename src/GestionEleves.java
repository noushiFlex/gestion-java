import java.util.Scanner;

public class GestionEleves {
    public void afficherMenu() {
        System.out.println("Gestion des élèves :\n");
        System.out.println("1: Ajouter un élève");
        System.out.println("2: Supprimer un élève");
        System.out.println("0: Retour");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez une option : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Ajout d'un élève...");
                break;
            case 2:
                System.out.println("Suppression d'un élève...");
                break;
            case 0:
                new Menu().afficherMenu();
                break;
            default:
                System.out.println("Option invalide");
        }
    }
}