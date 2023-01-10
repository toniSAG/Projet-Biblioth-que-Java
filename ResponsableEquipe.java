public class ResponsableEquipe extends Employes{

    private int NombreEquipe;
    final int Salaire = 1800;
    public ResponsableEquipe(String sonNom, String sonPrenom, int sonAge, int sonNombreEquipe){
        super(sonNom, sonPrenom, sonAge);
        sonNombreEquipe = NombreEquipe;
    }

    public String toString(){
        return "Le responsable d'équipe gère une équipe de " + NombreEquipe + " personnes";
    }
}