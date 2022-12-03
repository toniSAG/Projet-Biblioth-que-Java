public class Roman extends Livre{

    final boolean EstFictif = true;

    public Roman(int sonISBN, String sonTitre, String sonAuteur, int sonAnneeDePublication){
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

   public boolean EstFictif(){
    if
   }

    public String toString(){
        return super.toString() + " c'est une oeuvre de " + EstFictif;
    }

    


}