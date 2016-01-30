package test2;

import test1.Beta;

public class Gama extends Beta {

   public Gama(int d) {
      super(d);
   }

   protected void imprimir() {
      super.imprimir();
   }
   
   public void imprimir2() {
      super.imprimir2();
      System.out.println("a = " + a + " b = " + b);
      System.out.println("c = " + c + "d = " + d);      
   }
}
