import java.util.Random;

public class Aleatorio {
   public static void main(String[] args) {      
      Random random = new Random();
      int randomNumber = random.nextInt(19);
      System.out.println(randomNumber);
   }
}
