package co.edu.uis.fig;


public class Principal {

   public static void main(String[] args) {

      Figura r = new Rectangulo(200, 200);
      Figura t = new Triangulo(150, 150);
      Figura c = new Circulo(180);
      Figura f = new Figura();
      
      System.out.println(r.area());
      System.out.println(t.area());
      System.out.println(c.area());
      System.out.println(f.area());
      
      
   }

}
