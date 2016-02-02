package test1;

public class Principal {


   public static void main(String[] args) {
      Alfa alfa1 = new Alfa(5, 4);
      
      int val = alfa1.suma1(10);
      System.out.println(val);
      alfa1.imprimir();
      
      int h = 5;      
      val = alfa1.suma2(h);
      System.out.println(val);
      alfa1.imprimir();
      
      int i = 9;      
      val = alfa1.suma3(h, i);
      System.out.println(val);
      alfa1.imprimir();      
   }

}
