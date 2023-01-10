public class Employes{
    protected String Nom;
    protected String Prenom;
    protected int Age;
    final double Prime = 100.0;

    public Employes(String sonNom, String sonPrenom, int sonAge){
        Nom = sonNom;
        Prenom = sonPrenom;
        Age = sonAge;
        
    }



    public double Salaire(){
        return Prime;
    }
    

  /*  public String toString(){
        return "L'employé se nomme " + Prenom + " " + Nom + " est agé(e) de " + Age;
    }*/



}