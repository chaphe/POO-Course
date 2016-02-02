package simple.window;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaSimple extends JFrame {

   public VentanaSimple(String titulo) {
      super(titulo);
      JButton boton1 = new JButton();
      boton1.setText("Click Me");                 
      add(boton1);
      
      AdministradorWindow admin = new AdministradorWindow();
      addWindowListener(admin);
   }   
}
