public class Documentaliste extends Employes{

    private int DocumentClasses;
    final int Salaire = 2000;
    public Documentaliste(String sonNom, String sonPrenom, int sonAge, int sesDocumentClasses){
        super(sonNom, sonPrenom, sonAge);
        sesDocumentClasses = DocumentClasses;
    }

    public int getDocumentClasses(){
        return DocumentClasses;
    }

    public void sesDocumentClasses(int DocumentClasses){
        this.DocumentClasses = DocumentClasses;
    }

    public String toString(){
        return "Le Documentaliste " + Prenom + " " + Nom + " a classés " + DocumentClasses + " Documents";
    }
}