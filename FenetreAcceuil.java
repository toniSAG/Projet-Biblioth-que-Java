import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreAcceuil extends JFrame /*implements ActionListener*/{

    private Gestion_Biblitotheque[] MaGestion_bibliotheque;


    JLabel background;
    JButton Button1, Button2;
    JPanel Conteneur;

   public FenetreAcceuil(Gestion_Biblitotheque[] tabGestion_bibliotheque){
        MaGestion_bibliotheque = new Gestion_Biblitotheque[tabGestion_bibliotheque.length];
        for(int i = 0; i < tabGestion_bibliotheque.length; i++){
            MaGestion_bibliotheque[i] = tabGestion_bibliotheque[i];
        }

        setTitle("Acceuil");
        setSize(800, 600);
        setLocation(300, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("Bibliotheque.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 800, 600);
        add(background);
        setVisible(true);

        Button1 = new JButton("Gestion des employés");
        Button1.setBounds(90, 20, 200, 50);

        Button2 = new JButton("Gestion des livres");
        Button2.setBounds(90, 100, 200, 50);

        JPanel Conteneur = new JPanel();
        Conteneur.setLayout(null);
        Conteneur.setBounds(200, 190, 360, 150);
        Conteneur.setBackground(Color.WHITE);
        Conteneur.add(Button1);
        Conteneur.add(Button2);
        add(Conteneur);
        setVisible(true);



    }

    public static void main(String[]args){
        new FenetreAcceuil();
    }

    //public void actionPerformed(ActionEvent e){}
}