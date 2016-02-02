package simple.panel.boton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaSimple extends JFrame {

   private JPanel panel;
   private JButton boton1;
   private JButton boton2;
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      panel = new JPanel();
      
      boton1 = new JButton();
      boton1.setText("Boton 1");
      boton2 = new JButton();
      boton2.setText("Boton 2");

      panel.add(boton1);
      panel.add(boton2);
      add(panel);
   }
   
}
