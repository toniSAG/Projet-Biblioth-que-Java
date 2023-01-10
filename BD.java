public class BD extends Livre{

    /*La classe BD est définie par l'ISBN, le titre, l'auteur
    * l'année de publication et par son dessinateur
    */

    private String Dessinateur;

    public BD(int sonISBN, String sonTitre, String sonAuteur, int sonAnneeDePublication){
        
        super(sonISBN, sonTitre, sonAuteur, sonAnneeDePublication);
    }

    public int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public String getTitre(){
        return Titre;
    }

    public void setTitre(String Titre){
        this.Titre = Titre;
    }

    public String Auteur(){
        return Auteur;
    }

    public void setAuteur(String Auteur){
        this.Auteur = Auteur;
    }

    public int AnneeDePublication(){
        return AnneeDePublication;
    }

    public void setAnneeDePublication(int AnneeDePublication){
        this.AnneeDePublication = AnneeDePublication;
    }

    public String Dessinateur(){
        return Dessinateur;
    }

    public void Dessinateur(String Dessinateur){
        this.Dessinateur = Dessinateur;
    }

    
    public boolean estDisponible(){
        String message1 = "Ce document est disponible";
        String message2 = "Ce document est indisponible";

        if(estDisponible() == true){
            System.out.println(message1);
        }

        else{
            System.out.println(message2);
        }
    }

public String toString(){
    return super.toString() + " cette BD a ete dessinee par " + Dessinateur;
}

}