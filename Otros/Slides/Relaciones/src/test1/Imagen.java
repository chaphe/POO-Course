package test1;

import java.awt.Color;

public class Imagen {

   private int ancho;
   private int alto;
   private Color[][] pixeles;

   public Imagen(int ancho, int alto) {
      this.ancho = ancho;
      this.alto = alto;
      pixeles = new Color[alto][ancho];
   }

   public boolean contieneColor(Color co) {
      for (int i = 0; i < alto; i++) {
         for (int j = 0; j < ancho; j++) {
            Color temp = pixeles[i][j];
            if (temp.getRed() == co.getRed()
                  && temp.getGreen() == co.getGreen()
                  && temp.getBlue() == co.getBlue()) {
               return true;
            }
         }
      }
      return false;
   }

}
