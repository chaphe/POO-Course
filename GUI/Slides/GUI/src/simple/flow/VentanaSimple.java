package simple.flow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSimple extends JFrame {
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      
      JButton button = new JButton("Boton 1");
      panel.add(button);
       
      button = new JButton("Boton 2");
      panel.add(button);
       
      button = new JButton("Boton 3");
      panel.add(button);
       
      button = new JButton("Boton 4");
      panel.add(button);
       
      button = new JButton("Boton 5");
      panel.add(button);
      
      add(panel);
   }
}
