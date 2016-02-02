package test1;

import java.util.Random;

public class NumerosPrimos {

   private int[] nums;
   
   public NumerosPrimos(int tamano) {
      nums = new int[tamano];
   }
      
   public void generarPrimos() {
      Random ra = new Random();
      for(int i=0;i<nums.length;i++) {
         nums[i] = ra.nextInt(100);
      }
   }
   
   public int contarPrimos() {
      int primos = 0;
      for(int i=0;i<nums.length;i++) {
         if (esPrimo(nums[i]))
            primos++;         
      }
      return primos;
   }

   private boolean esPrimo(int numero) { return true; }
      
}
