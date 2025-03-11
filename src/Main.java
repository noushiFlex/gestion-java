import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("\tBienvenu dans l'application");
        System.out.println("--------------------------------\n\n");

        System.out.println("\tConnexion\n\n\n");

        System.out.print("Nom d'utilisateur : ");
        String nom = scanner.nextLine();

        System.out.print("Mot de passe : ");
        String motDePasse = scanner.nextLine();

        Utilisateur user = new Utilisateur(nom, motDePasse);

        if (user.authentification()) {
            System.out.println("Le mot de passe est correct ✅\n");
            Menu menu = new Menu();
            menu.afficherMenu();
        } else {
            System.out.println("Le mot de passe est incorrect ❌");
        }

        scanner.close();
    }
}