package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Principal {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      
      Imagen imagen = new Imagen(600, 600);
      Color negro = new Color(0,0,0);
      Rectangulo  r = new Rectangulo(10, 10, negro, 200, 200);
      Triangulo t = new Triangulo(20, 20, negro, 150, 150);
      Circulo c = new Circulo(200, 200, negro, 180);
      
      r.dibujar(imagen);
      t.dibujar(imagen);
      c.dibujar(imagen);
      
      
   }

}
