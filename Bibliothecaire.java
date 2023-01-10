public class Bibliothecaire extends Employes{

    private int NumberHour;
    final int Salaire = 1300;
    public Bibliothecaire(String sonNom, String sonPrenom, int sonAge, int sonNumberHour){
        super(sonNom, sonPrenom, sonAge);
        sonNumberHour = NumberHour;
    }

    public int getNumberhour(){
        return NumberHour;
    }

    public void sonNumberHour(int NumberHour){
        this.NumberHour = NumberHour;
    }

    public String toString(){
        return Prenom + " " + Nom + " effectue " + NumberHour + " heures par semaine en temps que Bibliothécaire";
    }
}