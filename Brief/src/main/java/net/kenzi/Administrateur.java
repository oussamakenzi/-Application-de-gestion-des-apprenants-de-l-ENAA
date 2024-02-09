
import net.kenzi.Apprenant;
import net.kenzi.Classe;

import java.util.List;

public class Administrateur {
    private List<Apprenant> listeApprenants;
    private List<Classe> listeClasses;

    public Administrateur(List<Apprenant> listeApprenants, List<Classe> listeClasses) {
        this.listeApprenants = listeApprenants;
        this.listeClasses = listeClasses;
    }

    // Méthodes pour gérer les apprenants
    public void ajouterApprenant(Apprenant apprenant) {
        listeApprenants.add(apprenant);
    }

    public static void modifierApprenant(String identifiant, Apprenant nouveauxDetails) {
        // Logique pour modifier un apprenant existant
    }

    public static void supprimerApprenant(String identifiant) {
        // Logique pour supprimer un apprenant existant
    }

    public static void consulterListeApprenants() {
        // Afficher la liste des apprenants
    }

    public static Apprenant rechercherApprenant(String identifiant) {
        // Logique pour rechercher un apprenant par nom, prénom ou numéro d'identifiant
        return null;
    }

    // Méthodes pour gérer les classes


    public List<Apprenant> filtrerApprenantsParClasse(int numeroClasse) {
        // Logique pour filtrer les apprenants par classe
        return null;
    }
}
