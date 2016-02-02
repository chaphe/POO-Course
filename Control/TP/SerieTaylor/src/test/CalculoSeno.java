package test;


public class CalculoSeno {

   public long factorial(int n) {
      if (n==0)
         return 1;      
      return n * factorial(n - 1);
   }
   
   public double potencia(double val, int p) {
      if (p==0)
         return 1.0;
      return val * potencia(val, p-1);
      
   }
      
   public double seno(double x) {
      double suma = 0;
      
      for (int n=0;n<15;n++) {
         int factor = (2 * n) + 1;
         double elemento = potencia(-1, n) * (potencia(x, factor)/factorial(factor));
         suma = suma + elemento;
      }      
      return suma;
   }
   

}
