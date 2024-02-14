package net.kenzi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Apprenant {
    private static List<Apprenant> listeApprenants = new ArrayList<>();
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String adresse;
    private String numeroDeTelephone;
    private int numeroClasse;
    private String apprenantID;

    public Apprenant() {
        this.apprenantID = UUID.randomUUID().toString();
    }

    public Apprenant(String nom, String prenom, String dateDeNaissance, String adresse, String numeroDeTelephone, int numeroClasse) {
        this();
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.numeroDeTelephone = numeroDeTelephone;
        this.numeroClasse = numeroClasse;

    }

    public static void ajouterApprenant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'apprenant :");
        String nom = scanner.next();
        System.out.println("Entrez le prénom de l'apprenant :");
        String prenom = scanner.next();
        System.out.println("Entrez la date de naissance de l'apprenant :");
        String dateNaissance = scanner.next();
        System.out.println("Entrez l'adresse de l'apprenant :");
        String adresse = scanner.next();
        System.out.println("Entrez le numéro de classe de l'apprenant :");
        int numeroClasse = scanner.nextInt();
        System.out.println("Entrez le numéro de téléphone de l'apprenant :");
        String numeroDeTelephone = scanner.next();

        // Créer un nouvel apprenant avec les informations fournies
        Apprenant nouvelApprenant = new Apprenant(nom, prenom, dateNaissance, adresse, numeroDeTelephone, numeroClasse);
        listeApprenants.add(nouvelApprenant);
        System.out.println("Nouvel apprenant ajouté avec succès !");
    }

    public static void modifierApprenant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'identifiant de l'apprenant à modifier :");
        String id = scanner.next();
        for (Apprenant apprenant : listeApprenants) {
            if (apprenant.getApprenantID().equals(id)) {
                System.out.println("Entrez le nouveau nom de l'apprenant :");
                String nom = scanner.next();
                System.out.println("Entrez le nouveau prénom de l'apprenant :");
                String prenom = scanner.next();
                System.out.println("Entrez la nouvelle date de naissance de l'apprenant :");
                String dateNaissance = scanner.next();
                System.out.println("Entrez la nouvelle adresse de l'apprenant :");
                String adresse = scanner.next();
                System.out.println("Entrez le nouveau numéro de classe de l'apprenant :");
                int numeroClasse = scanner.nextInt();
                System.out.println("Entrez le nouveau numéro de téléphone de l'apprenant :");
                String numeroDeTelephone = scanner.next();

                // Mettre à jour les informations de l'apprenant
                apprenant.setNom(nom);
                apprenant.setPrenom(prenom);
                apprenant.setDateDeNaissance(dateNaissance);
                apprenant.setAdresse(adresse);
                apprenant.setNumeroDeTelephone(numeroDeTelephone);
                apprenant.setNumeroClasse(numeroClasse);

                System.out.println("Apprenant modifié avec succès !");
                return;
            }
        }
        System.out.println("Aucun apprenant trouvé avec cet identifiant.");
    }

    public static void supprimerApprenant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'identifiant de l'apprenant à supprimer :");
        String id = scanner.next();
        for (Apprenant apprenant : listeApprenants) {
            if (apprenant.getApprenantID().equals(id)) {
                listeApprenants.remove(apprenant);
                System.out.println("Apprenant supprimé avec succès !");
                return;
            }
        }
        System.out.println("Aucun apprenant trouvé avec cet identifiant.");
    }

    public static void consulterListeApprenants() {
        System.out.println("Liste des apprenants :");
        for (Apprenant apprenant : listeApprenants) {
            System.out.println(apprenant.toString()); // Utilisation de la méthode toString() pour afficher les informations de l'apprenant
        }
    }

    public static void rechercherApprenant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom, prénom ou identifiant de l'apprenant à rechercher :");
        String keyword = scanner.next();
        for (Apprenant apprenant : listeApprenants) {
            if (apprenant.getNom().equalsIgnoreCase(keyword) || apprenant.getPrenom().equalsIgnoreCase(keyword) || apprenant.getApprenantID().equalsIgnoreCase(keyword)) {
                System.out.println("Apprenant trouvé :");
                System.out.println(apprenant.toString());
                return;
            }
        }
        System.out.println("Aucun apprenant trouvé avec ce nom, prénom ou identifiant.");
    }



    @Override
    public String toString() {
        return "Apprenant{" +
                "\nnom='" + nom + '\'' +
                "\nprenom='" + prenom + '\'' +
                "\ndateDeNaissance='" + dateDeNaissance + '\'' +
                "\nadresse='" + adresse + '\'' +
                "\nnumeroDeTelephone='" + numeroDeTelephone + '\'' +
                "\nnumeroClasse=" + numeroClasse +
                "\napprenantID='" + apprenantID + '\'' +
                "\n}";
    }

    // Getters et setters
    public static List<Apprenant> getListeApprenants() {
        return Apprenant.listeApprenants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public int getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    public String getApprenantID() {
        return apprenantID;
    }

    public void setApprenantID(String apprenantID) {
        this.apprenantID = apprenantID;
    }
}