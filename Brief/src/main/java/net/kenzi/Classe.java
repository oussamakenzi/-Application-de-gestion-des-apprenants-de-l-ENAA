package net.kenzi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Classe {
    private static List<Classe> listeClasses = new ArrayList<>();

    private String nom;
    private int numeroDeClasse;
    private int effictifs;
    private String classeId;
    public Classe(){
        this.classeId=UUID.randomUUID().toString();
    }
    public Classe (String nom,int numeroDeClasse,int effictifs){
        this();
        this.nom=nom;
        this.numeroDeClasse=numeroDeClasse;
        this.effictifs=effictifs;

    }
    public static void ajouterUneClasse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la classe :");
        String nom = scanner.next();
        System.out.println("Entrez le numero de la classe :");
        int numeroDeClasse = scanner.nextInt();
        System.out.println("Entrez l'effectif  de la classe  :");
        int effictifs = scanner.nextInt();
        Classe classe = new Classe(nom, numeroDeClasse,effictifs);
        listeClasses.add(classe);
    }
    public static void modifierUneClasse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'identifiant de la classe  à modifier :");
        String id = scanner.next();
        for (Classe classe :listeClasses) {
            if (classe.getClasseId().equals(id)){
                System.out.println("Entrez le nouveau nom de la classe :");
                String nom = scanner.next();
                System.out.println("Entrez le nouveau numero de la classe  :");
                int numeroDeclasse = scanner.nextInt();
                System.out.println("Entrez la nouvelle effictifs de la classe  :");
                int effictifs = scanner.nextInt();
                Classe.setNom(nom);
                Classe.setNumeroDeClasse(numeroDeclasse);
                Classe.setEffictifs(effictifs);

            }

        }
    }
    public static void supprimerClasse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'identifiant de la classe à supprimer :");
        String id = scanner.next();
        for (Classe classe : listeClasses) {
            if (classe.getClasseId().equals(id)) {
                listeClasses.remove(classe);
                System.out.println("Classe supprimée avec succès !");
                return;
            }
        }
        System.out.println("Aucune classe trouvée avec cet identifiant.");
    }

    public static void afficherListeClasses() {
        System.out.println("Liste des classes :");
        for (Classe classe : listeClasses) {
            System.out.println("{\nNom: " + classe.getNom() + ", \numéro: " + classe.getNumeroDeClasse()+"\nffectif ");
        }
    }

    public static void filtrerApprenantsParClasse(int numeroClasse) {
        System.out.println("Apprenants dans la classe " + numeroClasse + ":");
        for (Apprenant apprenant : Apprenant.getListeApprenants()) {
            if (apprenant.getNumeroClasse() == numeroClasse) {
                System.out.println(apprenant.toString());
            }
        }
    }


    public int getEffictifs() {
        return effictifs;
    }

    public String getNom() {
        return nom;
    }

    public static List<Classe> getListeClasses() {
        return listeClasses;
    }

    public  int getNumeroDeClasse() {
        return numeroDeClasse;
    }

    public String getClasseId() {
        return classeId;
    }

    public void setClasseId(String classeId) {
        this.classeId = classeId;
    }

    public static void setListeClasses(List<Classe> listeClasses) {
        Classe.listeClasses = listeClasses;
    }

    public  static void setEffictifs(int effictifs) {
        effictifs = effictifs;
    }

    public static void setNom(String nom) {
        nom = nom;
    }

    public static void setNumeroDeClasse(int numeroDeClasse) {
        numeroDeClasse = numeroDeClasse;
    }
}