package simple.panel.texto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSimple extends JFrame {

   private JPanel panel;
   private JButton boton1;
   private JTextField text;
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      panel = new JPanel();
      
      boton1 = new JButton();
      boton1.setText("Boton 1");
      text = new JTextField();
      text.setText("Hola mundo");
      
      panel.add(boton1);
      panel.add(text);
      add(panel);
   }
   
}
