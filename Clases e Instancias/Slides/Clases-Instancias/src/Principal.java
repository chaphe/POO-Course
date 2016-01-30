
public class Principal {

   public static void main(String[] args) {
      Rectangulo r1;
      Rectangulo r2;
      
      r1 = new Rectangulo();
      r1.inicializar(20.2f, 10.5f);
      
      r2 = new Rectangulo();
      r1.inicializar(10.4f, 10.3f);

      float area1 = r1.area();
      float area2 = r2.area();
      
      System.out.println("Area Circulo 1: " + area1);
      System.out.println("Area Circulo 2: " + area2);
   }

}
