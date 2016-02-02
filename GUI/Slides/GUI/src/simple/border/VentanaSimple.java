package simple.border;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaSimple extends JFrame {
   
   public VentanaSimple(String titulo) {
      super(titulo);
      
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      
      JButton button = new JButton("Norte (PAGE_START)");
      panel.add(button, BorderLayout.PAGE_START);
       
      button = new JButton("Centro (CENTER)");
      panel.add(button, BorderLayout.CENTER);
       
      button = new JButton("Este (LINE_START)");
      panel.add(button, BorderLayout.LINE_START);
       
      button = new JButton("Oeste (PAGE_END)");
      panel.add(button, BorderLayout.PAGE_END);
       
      button = new JButton("Sur (LINE_END)");
      panel.add(button, BorderLayout.LINE_END);
      
      add(panel);
   }
}
