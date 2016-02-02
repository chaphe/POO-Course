package test;

import java.awt.Color;


public class GreyPicture extends Imagen {

   public GreyPicture(int w, int h) {
      super(w, h);
   }

   public GreyPicture(String fileName) {
      super(fileName);
   }
   
   public void transformarAGris() {
      int alto = getAlto();
      int ancho = getAncho();
      
      for (int i = 0; i < ancho; i++) {
         for (int j = 0; j < alto; j++) {
            Color color = getColor(i, j);
            
            float iluminance = (float) (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue());
            int iluEntera = Math.round(iluminance);
            
            Color newColor = new Color(iluEntera, iluEntera, iluEntera);
            
            setColor(i, j, newColor);
         }
      }
      
   }
   
   
   public static void main(String[] args) {
      GreyPicture pic = new GreyPicture(args[0]);
      System.out.printf("%d-by-%d\n", pic.getAncho(), pic.getAlto());
      pic.transformarAGris();
      pic.mostrar();
  }

}
