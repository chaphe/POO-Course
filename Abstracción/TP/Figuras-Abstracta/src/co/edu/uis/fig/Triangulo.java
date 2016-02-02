package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Triangulo extends Figura {

   private int base;
   private int altura;

   public Triangulo(int base, int altura) {
      super();
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
   
 }
