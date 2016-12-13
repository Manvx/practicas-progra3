/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Lab extends JFrame{
    
    JTextField username = new JTextField(15);
    JTextField telefono = new JTextField(15);
    String[] formats = { "Masculino", "Femenino"};
    JComboBox formatBox = new JComboBox(formats);
    JTextArea comments = new JTextArea(4, 15);
    JButton aceptar = new JButton("Aceptar");
    JButton limpiar = new JButton("Limpiar");
    
    
    
    public Lab(){
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        
        
        
   /*   add(usernameLabel);
        add(username);
        add(telefonoLabel);
        add(telefono);
        add(commentsLabel);
        add(comments);
        add(aceptar);
        add(limpiar);
        add(formatLabel);
        add(formatBox);  
        
        setVisible(true);*/
        
        GridLayout lm = new GridLayout(6, 2);
       // setLayout(lm);
        JPanel pane = new JPanel();
        pane.setLayout(lm);
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel telefonoLabel = new JLabel("Phone: ");
        JLabel commentsLabel = new JLabel("Info: ");
        JLabel formatLabel = new JLabel("Gender: ");
        
          //set the name to components
        usernameLabel.setName("lblUsername");
        telefonoLabel.setName("lbltelephone");
        commentsLabel.setName("lblComments");
        username.setName("username");
        telefono.setName("password");
        comments.setName("comments");
        aceptar.setName("ok");
        limpiar.setName("clean");
       
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        
        pane.setName("Form");
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(telefonoLabel);
        pane.add(telefono);
        pane.add(formatLabel);
        pane.add(formatBox);
        pane.add(aceptar);
        pane.add(limpiar);
        pane.add(commentsLabel);
        pane.add(comments);
      
        add(pane);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    public static void main(String[] arguments) {
        Lab.setLookAndFeel();
        Lab lb = new Lab();
      
    }
    
    
}
