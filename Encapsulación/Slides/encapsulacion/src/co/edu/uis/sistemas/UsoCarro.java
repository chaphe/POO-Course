package co.edu.uis.sistemas;

public class UsoCarro {

   public static void main(String[] args) {
      Carro unCarro = new Carro("Spark", 2013);
      Carro otroCarro = new Carro("Clio", 2012, 255, 0, 0);

      
      System.out.println(unCarro);
      System.out.println(otroCarro);
   }

}
