import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class FenetreBibliotheque extends JFrame implements ActionListener{
    JButton Button1, Button2;
    JTextArea Text1;
    private Gestion_Biblitotheque[] MaGestion_bibliotheque;
    private FenetreAcceuil F1;



    public FenetreBibliotheque(){



    JLabel background;
    setTitle("Gestionnaire de la Bibliothèque");
    setSize(800, 600);
    setLocation(300, 100);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    JLabel Label1 = new JLabel();
    Label1.setText("Bienvenue dans le gestionnaire de la Bibliothèque");
    Label1.setBounds(40, 0, 300, 50);

    ImageIcon img = new ImageIcon("Bibliotheque.jpg");
    background = new JLabel("", img, JLabel.CENTER);
    background.setBounds(0, 0, 800, 600);
    add(background);
    setVisible(true);
    

    // Bouton vers la fenêtre de Gestion
    Button1 = new JButton("Cliquez ici pour Demarrer");
    Button1.setBounds(100, 20, 200, 50);
    Button1.addActionListener(this);

    // Bouton de fermeture de la fenêtre
    Button2 = new JButton("Fermer la fenêtre");
    Button2.setBounds(100, 100, 200, 50);
    Button2.addActionListener(this);

    JPanel Conteneur1 = new JPanel();
    Conteneur1.setLayout(null);
    Conteneur1.setBounds(190, 200, 360, 150);
    Conteneur1.setBackground(Color.WHITE);
    Conteneur1.add(Label1);
    Conteneur1.add(Button1);
    Conteneur1.add(Button2);
    Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    Conteneur1.setBorder(lineBorder);
    add(Conteneur1);
    setVisible(true);



    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Button1){
            for(int i = 0; i < MaGestion_bibliotheque.length; i++){
                System.out.println(F1);
            }
        }

        if (e.getSource()== Button2){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
        }
    }   
}