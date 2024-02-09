package net.kenzi;
    public class Classe  {
    private String nom;
    private int numeroDeClasse;
    private int effectif;
        public Classe(int numeroDeClasse, String nom, int effectif) {
            this.numeroDeClasse = numeroDeClasse;
            this.nom = nom;
            this.effectif = effectif;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getNumeroDeClasse() {
            return numeroDeClasse;
        }

        public void setNumeroDeClasse(int numeroDeClasse) {
            this.numeroDeClasse = numeroDeClasse;
        }

        public int getEffectif() {
            return effectif;
        }

        public void setEffectif(int effectif) {
            this.effectif = effectif;
        }
       // public void ajouterClasse(Classe classe) {
           // listeClasses.add(classe);
        //}

        public void modifierClasse(int numeroClasse, Classe nouveauxDetails) {
            // Logique pour modifier une classe existante
        }

        public void supprimerClasse(int numeroClasse) {
            // Logique pour supprimer une classe existante
        }

        public void consulterListeClasses() {
            // Afficher la liste des classes
        }

    }
