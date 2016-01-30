package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Triangulo extends Figura {

   private int base;
   private int altura;

   public Triangulo(int x, int y, Color color, int base, int altura) {
      super(x, y, color);
      this.base = base;
      this.altura  = altura;
   }

   public double area() {
      return (base * altura) / 2;
   }

   public double perimetro() {
      return base + altura + hipotenusa();
   }

   public double hipotenusa() {
      return Math.sqrt((base * base) + (altura * altura));
   }
   
   public void dibujar(Imagen img) {

      int xf = getX() + base;
      int yf = getY() + altura;
      
      for (int i = getX(); i<xf; i++) {
          img.setColor(i, yf, getColor());
      }
      
      for (int j = getY(); j<yf; j++) {
          img.setColor(getY(), j, getColor());
      }
      
      //diagonal 
      for (double k=0; k<1.0; k +=0.01 ){
          double l = getX() + k* base;
          double p = getY() + k* altura;
          img.setColor((int)l, (int)p, getColor());
      }
      
      // Muestra el dibujo en la ventana
      img.mostrar();
  }
}
