package test2;

public class Principal {

   public static void main(String[] args) {
      Beta beta1 = new Beta(10);
      Gama gama1 = new Gama(20);
      Gama gama2 = new Gama(15);

      int val = beta1.suma1(gama1);
      System.out.println(val);
      beta1.imprimir();
      
      val = beta1.suma2(gama1, gama2);
      System.out.println(val);
      beta1.imprimir();
      
      val = beta1.suma2(gama1, gama1);
      System.out.println(val);
      beta1.imprimir();            
   }

}
