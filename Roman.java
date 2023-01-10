public class Roman extends Livre{

    /*La classe roman est définie par son ISBN, son titre,
     * son auteur, son année de publication et par son statut d'oeuvre de fiction
     */

    final boolean EstFictif = true;

    public Roman(int sonISBN, String sonTitre, String sonAuteur, int sonAnneeDePublication){
        super(sonISBN, sonTitre, sonAuteur, sonAnneeDePublication);
    }

    public int getISBN(){
        return this.ISBN;
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
        return this.Auteur;
    }

    public void setAuteur(String Auteur){
        this.Auteur = Auteur;
    }

    public int AnneeDePublication(){
        return this.AnneeDePublication;
    }

    public void setAnneeDePublication(int AnneeDePublication){
        this.AnneeDePublication = AnneeDePublication;
    }

  /*  public boolean EstFictif(){
    if (EstFictif == "Fiction") ;
   }*/

    public String toString(){
        if (EstFictif == "Fiction")
        return super.toString() + " c'est une oeuvre de " + EstFictif;
    }

    


}