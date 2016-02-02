package test1;

public class Alfa {
   
   private int a;
   private int b;
   
   public Alfa(int a, int b) {
      this.a = a;
      this.b = b;
   }
   
   public int suma1(int c) {
      a = a + c;
      return a;
   }
   
   public int suma2(int c) {
      b = b + c;
      return b;      
   }
   
   public int suma3(int c, int d) {
      return c + d;
   }
   
   public void imprimir() {
      System.out.println("valor a: " + a);
      System.out.println("valor b: " + b);
   }
}
