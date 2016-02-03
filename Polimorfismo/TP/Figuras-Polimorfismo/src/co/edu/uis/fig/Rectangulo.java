package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Rectangulo extends Figura {

   private int ancho;
   private int alto;

   public Rectangulo(int x, int y, Color color, int ancho, int alto) {
      super(x, y, color);
      this.ancho = ancho;
      this.alto = alto;
   }

   public double area() {
      return ancho * alto;
   }

   public double perimetro() {
      return 2 * ancho + 2 * alto;
   }

   public void dibujar(Imagen img) {
      int xf = getX() + ancho;
      int yf = getY() + alto;

      for (int i = getX(); i < xf; i++) {
         img.setColor(i, getY(), getColor());
         img.setColor(i, yf, getColor());
      }

      for (int j = getY(); j < yf; j++) {
         img.setColor(getX(), j, getColor());
         img.setColor(xf, j, getColor());
      }
      // Muestra el dibujo en la ventana
      img.mostrar();
   }

}
