package test1;

import test1.Beta;

public class Delta extends Beta {

   private int e; 
   
   public Delta(int d, int e) {
      super(d);
      this.e = e;
   }

   public void imprimir() {
      System.out.println("b = " + b + "c = " + c);
   }
   
   public void imprimir2() {
      System.out.println("e = " + e + "c = " + c);
   }
   
}
