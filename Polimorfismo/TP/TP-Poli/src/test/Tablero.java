package test;

import java.awt.Color;
import java.util.ArrayList;

import tratamiento.Imagen;

public class Tablero extends Imagen {

   ArrayList<Figura> figuras = new ArrayList<Figura>();
   
   public Tablero(int ancho, int alto) {
      super(ancho, alto);
      Color blanco = new Color(255, 255, 255);
      for (int i = 0; i < ancho; i++) {
         for (int j = 0; j < alto; j++) {
            setColor(i, j, blanco);
         }         
      }
   }

   public void agregarFigura(Figura figura) {
      figuras.add(figura);
   }
   
   public void dibujarFiguras() {
      for (Figura figura : figuras) {
         figura.dibujar(this);
      }
   }
   
}
