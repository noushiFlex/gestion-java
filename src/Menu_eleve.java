

public class Menu_eleve {
    

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

}
