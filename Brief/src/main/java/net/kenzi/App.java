package net.kenzi;

import java.util.Scanner;

import static net.kenzi.Apprenant.*;

//import static net.kenzi.Apprenants.ajouterUnApprenant;

public class App {
    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            afficherMenuPrincipal();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    gererApprenants();
                    break;
                case 2:
                    gererClasses();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        //scanner.close();
    }

    public static void afficherMenuPrincipal() {
        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1. Gérer les apprenants");
        System.out.println("2. Gérer les classes de l'école");
        System.out.println("3. Quitter");
        System.out.print("Choix: ");
    }


    public static void gererApprenants() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            afficherMenuApprenants();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    ajouterApprenant();
                    break;
                case 2:
                    modifierApprenant();
                    break;
                case 3:
                    supprimerApprenant();
                    break;
                case 4:
                    consulterListeApprenants();
                    break;
                case 5:
                    rechercherApprenant();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        //scanner.close(); // Fermer le scanner une fois que la boucle est terminée
    }
    public static void gererClasses() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            afficherMenuClasses();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    Classe.ajouterUneClasse();
                    break;
                case 2:
                    Classe.modifierUneClasse();
                    break;
                case 3:
                    Classe.supprimerClasse();
                    break;
                case 4:
                    Classe.afficherListeClasses();
                    break;
                case 5:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("entrez le numero de classe a failtrer :");
                    int n = sc.nextInt();
                    Classe.filtrerApprenantsParClasse(n);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        //scanner.close(); // Fermer le scanner une fois que la boucle est terminée
    }

    public static void afficherMenuClasses() {
        System.out.println("\n===== GÉRER LES CLASSES =====");
        System.out.println("1. Ajouter une nouvelle classe");
        System.out.println("2. Modifier les informations d'une classe existante");
        System.out.println("3. Supprimer une classe existante");
        System.out.println("4. Consulter la liste des classes");
        System.out.println("5. Filtrer les apprenants par classe");
        System.out.println("6. Retour");
        System.out.print("Choix: ");
    }




    public static void afficherMenuApprenants() {
        System.out.println("\n===== GÉRER LES APPRENANTS =====");
        System.out.println("1. Ajouter un nouvel apprenant");
        System.out.println("2. Modifier les informations d'un apprenant existant");
        System.out.println("3. Supprimer un apprenant existant");
        System.out.println("4. Consulter la liste des apprenants");
        System.out.println("5. Rechercher un apprenant");
        System.out.println("6. Retour");
        System.out.print("Choix: ");
    }
}
