package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

   private void test1() {
      List lista1 = new ArrayList();
      lista1.add(new Double(3.5));
      lista1.add(new Double(4.5));
      lista1.remove(0);
      lista1.size();

      List lista2 = new LinkedList();
      lista2.add(new Double(3.5));
      lista2.add(new Double(4.5));
      lista2.remove(0);
      lista2.addAll(lista1);
      lista2.size();
   }

   private void test2() {
      List<String> lista1 = new ArrayList<String>();
      lista1.add("AA");
      lista1.add("BB");
      lista1.remove(0);
      lista1.size();

      List<String> lista2 = new LinkedList<String>();
      lista2.add("CC");
      lista2.add("DD");
      lista2.remove(1);
      lista2.addAll(lista1);
      lista2.size();
   }

   private void test3() {
      List miLista = new ArrayList();
      miLista.add(new Double(3.5));
      miLista.add(new Double(4.5));

      for (int i = 0; i < miLista.size(); i++) {
         Double ele = (Double) miLista.get(i);
         System.out.println(ele);
      }

      for (Object object : miLista) {
         Double ele = (Double) object;
         System.out.println(ele);
      }
   }

   private void test4() {
      List<Double> miLista = new ArrayList<Double>();
      miLista.add(new Double(3.5));
      miLista.add(new Double(4.5));

      for (int i = 0; i < miLista.size(); i++) {
         Double ele = miLista.get(i);
         System.out.println(ele);
      }

      for (Double ele : miLista) {
         System.out.println(ele);
      }
   }

   private void test5() {
      List miLista = new ArrayList();
      miLista.add(new Double(3.5));
      miLista.add(new Double(4.5));

      Iterator it = miLista.iterator();
      while (it.hasNext()) {
         Double ele = (Double) it.next();
         System.out.println(ele);
      }
   }

   private void test6() {
      List<Double> miLista = new ArrayList<Double>();
      miLista.add(new Double(3.5));
      miLista.add(new Double(4.5));

      Iterator<Double> it = miLista.iterator();
      while (it.hasNext()) {
         Double ele = it.next();
         System.out.println(ele);
      }
   }

   private void test7() {
      List<Double> miLista = new ArrayList<Double>();
      miLista.add(new Double(3.5));
      miLista.add(new Double(4.5));
      miLista.add(new Double(5.5));
      miLista.add(new Double(6.5));

      Iterator<Double> it = miLista.iterator();
      while (it.hasNext()) {
         Double ele = it.next();
         System.out.println(ele);
         if (ele<5.0)
            it.remove();
      }
   }
   
   private void test8() {
      Map mapa = new HashMap();
      mapa.put(new Integer(2102223), "Juan Perez");
      mapa.put(new Integer(2102224), "Pedro Lopez");
      mapa.put(new Integer(2102225), "Jesus Gomez");

      System.out.println(mapa.get(new Integer(2102223)));
      System.out.println(mapa.containsKey(new Integer(2102223)));

      Set llaves = mapa.keySet();
      Iterator it1 = llaves.iterator();
      while (it1.hasNext()) {
         System.out.println(it1.next());
      }

      mapa.remove(new Integer(2102223));
      Collection valores = mapa.values();
      Iterator it2 = valores.iterator();
      while (it2.hasNext()) {
         System.out.println(it2.next());
      }
   }

   private void test9() {
      Map<Integer, String> mapa = new HashMap<Integer, String>();
      mapa.put(new Integer(2102223), "Juan Perez");
      mapa.put(new Integer(2102224), "Pedro Lopez");
      mapa.put(new Integer(2102224), "Jesus Gomez");

      Set<Integer> llaves = mapa.keySet();
      Collection<String> valores = mapa.values();
   }

   private void contar(String st) {
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

   public static void main(String[] args) {
      Principal p = new Principal();
      p.contar("este es un texto ejemplo este ejemplo es para probar");
      p.test7();
   }
}
