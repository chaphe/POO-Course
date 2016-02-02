package test2;

public class Beta {
   
   private int a;
   
   public Beta(int a) {
      this.a = a;
   }
   
   public int suma1(Gama ga) {
      a = a + ga.getB();
      return a;
   }
   
   public int suma2(Gama ga1, Gama ga2) {      
      return ga1.getB() + ga2.getB();      
   }
      
   public void imprimir() {
      System.out.println("valor a: " + a);
   }
}
