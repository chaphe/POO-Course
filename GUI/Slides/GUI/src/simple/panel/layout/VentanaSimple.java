package simple.panel.layout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSimple extends JFrame {

   private JPanel panel;
   private JLabel label1;
   private JTextField text;
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      panel = new JPanel();
      
      label1 = new JLabel();
      label1.setText("Label 1");
      text = new JTextField();
      text.setText("Hola mundo");
      
      panel.add(label1);
      panel.add(text);
      add(panel);
   }
}
