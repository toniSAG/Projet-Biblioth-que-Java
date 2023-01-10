import java.awt.*;


public class Bibliotheque_Test{
    public static void main(String[]args){

        //Employés répertoriés

        Employes E1 = new Directeur("Durand", "Gérard", 45, 80000);
        Employes E2 = new ResponsableEquipe("Cohen", "Marla", 32, 19);
        Employes E3 = new Bibliothecaire("", "", 25, 40);


        //Livres répertoriés

        Livre L1 = new BD(36303630, "Sangre", "Arleston", 2016);


        System.out.println(E1.toString());
        System.out.println(E2.toString());

        System.out.println(L1.toString());

        Gestion_Biblitotheque[] tabGestion_bibliotheque ={E1, E2, L1};
        for(int i = 0; i < tabGestion_bibliotheque.length; i++){
            System.out.println(tabGestion_bibliotheque[i]);
        }
    


        FenetreBibliotheque F1 = new FenetreBibliotheque(tabGestion_bibliotheque);
    }
}