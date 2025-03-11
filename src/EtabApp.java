
import java.util.ArrayList;
import java.util.Scanner;

import src.Professeur;

public class EtabApp {
    private static ArrayList<Eleve> eleves = new ArrayList<>();
    private static ArrayList<Professeur> professeurs = new ArrayList<>();
    private static ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Ajouter l'utilisateur par défaut
        utilisateurs.add(new Utilisateur("admin", "admin"));

        if (connexion()) {
            menuPrincipal();
        }
    }

    // Écran de connexion
    private static boolean connexion() {
        System.out.println("******************************************************");
        System.out.println("BIENVENU DANS L’APPLICATION ETAB v1.1");
        System.out.println("******************************************************");
        System.out.println("CONNEXION");
        System.out.print("Identifiant : ");
        String identifiant = scanner.nextLine();
        System.out.print("Mot de passe : ");
        String motDePasse = scanner.nextLine();

        for (Utilisateur user : utilisateurs) {
            if (user.getIdentifiant().equals(identifiant) && user.getMotDePasse().equals(motDePasse)) {
                System.out.println("Connexion réussie !");
                return true;
            }
        }
        System.out.println("Identifiant ou mot de passe incorrect.");
        return false;
    }

    // Menu principal
    private static void menuPrincipal() {
        while (true) {
            System.out.println("******************************************************");
            System.out.println("BIENVENU DANS L’APPLICATION ETAB v1.1");
            System.out.println("******************************************************");
            System.out.println("MENU:");
            System.out.println("1: Gestion des élèves");
            System.out.println("2: Gestion des professeurs");
            System.out.println("3: Gestion des utilisateurs");
            System.out.println("0: Quitter");
            System.out.print("Choisissez une option : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    gestionEleves();
                    break;
                case "2":
                    gestionProfesseurs();
                    break;
                case "3":
                    gestionUtilisateurs();
                    break;
                case "0":
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Option invalide.");
            }
        }
    }

    // Gestion des élèves
    private static void gestionEleves() {
        while (true) {
            System.out.println("******************************************************");
            System.out.println("GESTION DES ELEVES");
            System.out.println("******************************************************");
            System.out.println("Menu :");
            System.out.println("1: Ajouter un élève");
            System.out.println("2: Supprimer un élève");
            System.out.println("3: Modifier les informations de l'élève");
            System.out.println("4: Lister les élèves");
            System.out.println("5: Obtenir le dernier élève ajouté");
            System.out.println("6: Retour");
            System.out.println("0: Quitter");
            System.out.print("Choisissez une option : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.print("Nom de l'élève : ");
                    String nomEleve = scanner.nextLine();
                    eleves.add(new Eleve(nomEleve));
                    System.out.println("Élève ajouté.");
                    break;
                case "4":
                    System.out.println("Liste des élèves : " + eleves);
                    break;
                case "5":
                    if (!eleves.isEmpty()) {
                        System.out.println("Dernier élève ajouté : " + eleves.get(eleves.size() - 1));
                    } else {
                        System.out.println("Aucun élève.");
                    }
                    break;
                case "6":
                    return;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Option non implémentée ou invalide.");
            }
        }
    }

    // Gestion des professeurs
    private static void gestionProfesseurs() {
        while (true) {
            System.out.println("******************************************************");
            System.out.println("GESTION DES PROFESSEURS");
            System.out.println("******************************************************");
            System.out.println("Menu :");
            System.out.println("1: Ajouter un professeur");
            System.out.println("2: Supprimer un professeur");
            System.out.println("3: Modifier les informations du professeur");
            System.out.println("4: Lister les professeurs");
            System.out.println("5: Obtenir le dernier professeur ajouté");
            System.out.println("6: Retour");
            System.out.println("0: Accueil");
            System.out.print("Choisissez une option : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    System.out.print("Nom du professeur : ");
                    String nomProf = scanner.nextLine();
                    professeurs.add(new Professeur(nomProf));
                    System.out.println("Professeur ajouté.");
                    break;
                case "4":
                    System.out.println("Liste des professeurs : " + professeurs);
                    break;
                case "5":
                    if (!professeurs.isEmpty()) {
                        System.out.println("Dernier professeur ajouté : " + professeurs.get(professeurs.size() - 1));
                    } else {
                        System.out.println("Aucun professeur.");
                    }
                    break;
                case "6":
                    return;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Option non implémentée ou invalide.");
            }
        }
    }

    // Gestion des utilisateurs (partiellement implémentée)
    private static void gestionUtilisateurs() {
        System.out.println("Gestion des utilisateurs non entièrement implémentée.");
        // Ajoute ici les options similaires si nécessaire
    }
}