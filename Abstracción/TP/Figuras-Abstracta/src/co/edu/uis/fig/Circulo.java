package co.edu.uis.fig;


public class Circulo extends Figura {

   private int radio;

   public Circulo(int radio) {
      super();
      this.radio = radio;
   }

   public double area() {
      return Math.PI * radio + radio;
   }

   public double perimetro() {
      return 2 * Math.PI * radio;
   }
}
