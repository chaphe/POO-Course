package test;

import java.awt.Color;

import tratamiento.Imagen;

public class Principal {

   /**
    * @param args
    */
   public static void main(String[] args) {

      
      Tablero img = new Tablero(500, 500);
      
      Figura fig1 = new Figura();
      
      
      img.mostrar();
      img.agregarFigura(fig1);
      img.dibujarFiguras();
      
   }

}
