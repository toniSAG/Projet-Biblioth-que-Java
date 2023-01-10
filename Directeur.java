public class Directeur extends Employes{

    private int Budget;
    final int Salaire = 2500;
    public Directeur(String sonNom, String sonPrenom, int sonAge, int sonBudget){
        super(sonNom, sonPrenom, sonAge);
        sonBudget = Budget;
    }

    public int getBuget(){
        return Budget;
    }

    public void sonBudget(int Budget){
        this.Budget = Budget;
    }

    public String toString(){
        return "Le directeur se nommme " + Prenom + " " + Nom + " est agé de " + Age  + " ans et gère un budget de " + Budget;
    }
}