import java.time.LocalTime;
import java.util.Scanner;

public class Menu {
    public void afficherMenu() {
        LocalTime heureActuelle = LocalTime.now();
        String dateSysteme = heureActuelle.getHour() + ":" + heureActuelle.getMinute();

        System.out.println(" ******************************************************");
        System.out.println(" \t\tBIENVENU DANS L’APPLICATION ETAB v1.1");
        System.out.println(" ******************************************************");
        System.out.println(" MENU:");
        System.out.println(" 1: Gestion des élèves");
        System.out.println(" 2: Gestion des professeurs");
        System.out.println(" 3: Gestion des utilisateurs");
        System.out.println(" 0: Quitter");
        System.out.println(" Date système : " + dateSysteme);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez une option : ");
        int choix = scanner.nextInt();

        traiterChoix(choix);
    }

    private void traiterChoix(int choix) {
        switch (choix) {
            case 1:
                // gererEleves(); // Appel de la méthode pour la gestion des élèves
                break;
            case 2:
                GestionDesProfesseurs.main();
                break;
            case 3:
                // gererUtilisateurs(); // Appel de la méthode pour la gestion des utilisateurs
                break;
            case 0:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
        }
    }

    // Exemple de méthodes qui redirigent vers d'autres classes ou fonctionnalités

    /*private void gererEleves() {
        System.out.println("Redirection vers la gestion des élèves...");
        // Appel de la classe correspondante
        GestionEleves gestionEleves = new GestionEleves();
        gestionEleves.afficherMenu();
    }

    private void gererProfesseurs() {
        System.out.println("Redirection vers la gestion des professeurs...");
        GestionProfesseurs gestionProfesseurs = new GestionProfesseurs();
        gestionProfesseurs.afficherMenu();
    }

    private void gererUtilisateurs() {
        System.out.println("Redirection vers la gestion des utilisateurs...");
        GestionUtilisateurs gestionUtilisateurs = new GestionUtilisateurs();
        gestionUtilisateurs.afficherMenu();
    }*/
}
