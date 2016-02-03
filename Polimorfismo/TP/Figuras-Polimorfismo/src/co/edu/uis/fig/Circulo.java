package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Circulo extends Figura {

   private int radio;

   public Circulo(int x, int y, Color color, int radio) {
      super(x, y, color);
      this.radio = radio;
   }

   public double area() {
      return Math.PI * radio + radio;
   }

   public double perimetro() {
      return 2 * Math.PI * radio;
   }

   public void dibujar(Imagen img) {
      int xc = getX() + radio;
      int yc = getY() + radio;

      for (int i = 0; i <= 360; i++) {
         int m = (int) (xc + (this.radio) * Math.cos(i));
         int n = (int) (yc + (this.radio) * Math.sin(i));
         img.setColor(m, n, getColor());
      }
      // Muestra el dibujo en la ventana
      img.mostrar();
   }

}
