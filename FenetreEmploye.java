import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreEmploye extends JFrame /*implements ActionListener*/{

    public FenetreEmploye(){
        setTitle("Gestion des employes");
        setSize(800, 600);
        setLocation(300, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        new FenetreEmploye();
    }

    public void actionPerformed(ActionEvent e){}




    
}