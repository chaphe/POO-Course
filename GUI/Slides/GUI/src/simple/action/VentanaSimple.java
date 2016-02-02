package simple.action;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSimple extends JFrame {

   public VentanaSimple(String titulo) {
      super(titulo);
      JButton boton1 = new JButton();
      boton1.setText("Click Me");
      AdministradorBoton admin = new AdministradorBoton();
      boton1.addActionListener(admin);
      add(boton1);
   }   
}
