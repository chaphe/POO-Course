package test2;


public class CalculoFactorial {

   
   public long factorial(int n) throws FactorialException {
      if (n < 0)
         throw new FactorialException("factorial indefinido para numero negativo") ;
      
      if (n==0)
         return 1;
      return n * factorial(n - 1);
   }
   
   public void testDelegar(int n) throws FactorialException {
      System.out.println("El factorial de " + n + " es:");
      long fact = factorial(n);
      System.out.println(fact);
      System.out.println("La ejecucion continua aqui");
   }
   
   public void testGestionar(int n) {
      System.out.println("El factorial de " + n + " es:");
      try {
         long fact = factorial(n);
         System.out.println(fact);
      } catch (FactorialException e) {
         System.out.println("Problema: " + e.getMessage());
      }
      System.out.println("La ejecucion continua aqui");
   }
   
   public void testTratar2(int n) throws FactorialException {      
      try {
         testDelegar(n);
      } catch (FactorialException e) {
         System.out.println("Un error ha ocurrido: " + e.getMessage());
      }
      System.out.println("La ejecucion continua - test 3");
   }


   
   
  
   
}
