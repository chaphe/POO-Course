package simple.grid;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaSimple extends JFrame {
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,2));
      
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
