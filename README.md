# Gestion des Professeurs et des Élèves

Ce projet est une application console en Java permettant de gérer les professeurs et les élèves. Il offre diverses fonctionnalités telles que l'ajout, la suppression, la modification, la visualisation de la liste complète et l'affichage du dernier élément ajouté pour chaque catégorie.

## Table des Matières

- [Fonctionnalités](#fonctionnalités)
- [Prérequis](#prérequis)
- [Installation et Compilation](#installation-et-compilation)
- [Utilisation](#utilisation)
- [Structure du Projet](#structure-du-projet)
- [Améliorations Possibles](#améliorations-possibles)
- [Licence](#licence)

## Fonctionnalités

### Gestion des Professeurs
- Ajouter un professeur (nom, prénom, ville, date de naissance, statut vacant)
- Supprimer un professeur
- Modifier un professeur
- Lister tous les professeurs
- Afficher le dernier professeur ajouté

### Gestion des Élèves
- Ajouter un élève (nom, prénom, ville, date de naissance, classe)
- Supprimer un élève
- Modifier un élève
- Lister tous les élèves
- Afficher le dernier élève ajouté

## Prérequis

- **Java Development Kit (JDK)** version 11 ou supérieure
- Un terminal ou une interface de ligne de commande

## Installation et Compilation

1. **Téléchargez le projet**  
   Clonez ce dépôt ou téléchargez les fichiers source.

2. **Compilation**  
   Ouvrez un terminal dans le répertoire contenant les fichiers `.java` et compilez tous les fichiers avec la commande suivante :

   ```bash
   javac *.java
   ```

## Utilisation

### Exécution de l'application

Pour lancer l'application principale, exécutez :

```bash
java Main
```

L'application vous demandera de saisir un nom d'utilisateur et un mot de passe pour vous authentifier. Si l'authentification réussit, vous aurez accès au menu principal de gestion.

## Structure du Projet

- **Personne.java**  
  Classe de base représentant une personne, contenant des informations communes (nom, prénom, ville, date de naissance) et des méthodes d'affichage.

- **Professeur.java**  
  Classe héritant de `Personne` et représentant un professeur. Elle inclut un attribut supplémentaire `vacant` pour indiquer si le professeur est vacant.

- **GestionDesProfesseurs.java**  
  Classe contenant la méthode `main` et toutes les opérations de gestion (ajout, suppression, modification, affichage) pour les professeurs.

- **Eleve.java**  
  Classe héritant de `Personne` et représentant un élève. Elle inclut un attribut `classe` pour indiquer la classe à laquelle l'élève appartient.

- **GestionDesEleves.java**  
  Classe contenant la méthode `main` et toutes les opérations de gestion (ajout, suppression, modification, affichage) pour les élèves.

- **Main.java**  
  Classe principale permettant l'authentification de l'utilisateur avant d'accéder au menu principal.

- **Utilisateur.java**  
  Classe gérant l'authentification des utilisateurs.

- **Menu.java**  
  Classe affichant le menu principal après l'authentification

## Améliorations Possibles

- Ajouter une interface graphique pour une meilleure interaction utilisateur.
- Intégrer une persistance des données (ex. enregistrement dans un fichier ou une base de données).
- Implémenter une gestion d'ID unique pour chaque personne (professeur ou élève).
- Ajouter des validations supplémentaires pour les entrées utilisateur.

