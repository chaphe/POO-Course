package test;

public class Cast {

   private void convertirImplicito() {
      float x = 5.8f;
      int y = 10;
      
      x = y;
      System.out.println(x);
   }
   
   private void convertirExplicito() {
      float x = 5.8f;
      int y = 10;
      
      y = (int) x;
      System.out.println(y);
   }
   
   
   public static void main(String[] args) {
      Cast test = new Cast();
      test.convertirImplicito();
      test.convertirExplicito();
   }
}
