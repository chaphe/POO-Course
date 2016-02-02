package simple.boton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaSimple extends JFrame {

   private JButton boton1;
   
   public VentanaSimple(String titulo) {
      super(titulo);
      boton1 = new JButton();
      boton1.setText("Boton 1");
      add(boton1);
   }
   
   public static void main(String[] args) {
      VentanaSimple vs = new VentanaSimple("Simple 2");
      vs.setSize(200, 200);
      vs.setVisible(true);
   }
}
