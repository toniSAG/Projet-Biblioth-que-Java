public class Livre{
    protected int ISBN;
    protected String Titre;
    protected String Auteur;
    protected int AnneeDePublication;

    public Livre(int sonISBN, String sonTitre, String sonAuteur, int sonAnneeDePublication){
        ISBN = sonISBN;
        Titre = sonTitre;
        Auteur = sonAuteur;
        AnneeDePublication = sonAnneeDePublication;
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

    public String toString(){
        return "Le titre de l'oeuvre est " + "'"+ Titre +"'"+ " elle a ete ecrite par " + Auteur +" et est sortie en " + AnneeDePublication + " avec l'ISBN " + ISBN;

    }
}