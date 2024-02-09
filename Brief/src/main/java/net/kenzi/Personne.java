package net.kenzi;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String dateDeNaissance;
    public Personne(String nom,String prenom,String adresse,String dateDeNaissance){
        this.nom = nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.dateDeNaissance=dateDeNaissance;


    }


    public Personne() {

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }
}

