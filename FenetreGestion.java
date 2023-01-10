import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreGestion extends JFrame /*implements ActionListener*/{

    String[] optionToChoose = {"BD", "Roman"};

    public FenetreGestion(){
        setTitle("Gestion des stocks");
        setSize(800, 600);
        setLocation(300, 100);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        JPanel ConteneurGestion = new JPanel();
        ConteneurGestion.setLayout(null);
        ConteneurGestion.setBounds(190, 200, 360, 150);
        add(ConteneurGestion);
        setVisible(true);
    }

    
    

    public static void main(String[]args){
        new FenetreGestion();
    }
    
    //public void actionPerformed(ActionEvent e){}
}