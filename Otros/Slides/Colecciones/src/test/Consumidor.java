package test;

import java.util.List;

public class Consumidor {

   public void imprimir() {
      Productor pro = new Productor();

      List tempLista = pro.getListaCadenas();
      
      System.out.println("El tamaño es: " + tempLista.size());
      
      for (int i = 0; i < tempLista.size(); i++) {
         String st = (String) tempLista.get(i);
         System.out.println(st);
      }

   }

   public static void main(String[] args) {
      Consumidor con = new Consumidor();
      con.imprimir();
   }

}
