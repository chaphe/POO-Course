package simple.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AdministradorBoton implements ActionListener {

   private int i
   = 0;
   
   public void actionPerformed(ActionEvent event) {
      JButton boton = (JButton) event.getSource();
      boton.setText("Clicks " + i++);
   }
}
