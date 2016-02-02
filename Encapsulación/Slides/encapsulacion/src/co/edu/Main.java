package co.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   
   
   public void sample() {
      Scanner entrada = new Scanner(System.in);
      String st = entrada.nextLine();
      
      String[] palabras = st.split(" ");
      HashMap<String, Integer> conteo = new HashMap<String, Integer>();
      
      for (String palabra : palabras) {
         if (conteo.containsKey(palabra)) {
            int valor = conteo.get(palabra) + 1;
            conteo.put(palabra, valor);
         } else {
            conteo.put(palabra, 1);
         }         
      }
      
      System.out.println(conteo);
      
   }

   public void maino(String[] args) {

      ArrayList<String> miLista = new ArrayList<String>();

      miLista.add("Esta");
      miLista.add("es");
      miLista.add("una");
      miLista.add("lista");
      miLista.add("de");
      miLista.add("cadenas");

      int n = miLista.size(); // Debe retornar 6

      System.out.println(miLista);

      String elemento = miLista.get(2); // Regresa "una"

      miLista.remove(3); // Remueve "lista"

      System.out.println(miLista);

      miLista.remove(elemento); // Remueve "una"

      System.out.println(miLista);

      for (int i = 0; i < miLista.size(); i++) {
         String cad = miLista.get(i);
         System.out.println(cad);
      }

      Iterator<String> it = miLista.iterator();
      while (it.hasNext()) {
         String cad = it.next();
         System.out.println(cad);
      }

      for (String cad : miLista) {
         System.out.println(cad);
      }

      int[] arreglo = { 5, 8, 21, 30 };
      
      for (int num : arreglo) {
         System.out.println(num);
      }
      
      ArrayList<Integer> listaEntero = new ArrayList<Integer>();
      listaEntero.add(50);
      int val = listaEntero.get(0);
      
      System.out.println(listaEntero);
      System.out.println(val);
      
      HashMap<String, Float> mapa = new HashMap<String, Float>();
      
      mapa.put("Pedro", 4.5f);
      mapa.put("Pablo", 3.5f);
      
      float valor = mapa.get("Pedro");
      
      mapa.containsKey("Pedro");
      
      
      
      System.out.println(valor);
      
      
   }
   
   public static void main(String[] args) {

      Main main = new Main();
      
      main.sample();
      
      
   }
   
   

}
