package test2;

import java.util.Random;

public class Principal {

   public static void main(String[] args) {
      Aspirante[] aspirantes = new Aspirante[2000];
      int numAspirantes = 0;
      
      Random rn = new Random();
      numAspirantes = 800;
      for (int i=0;i<numAspirantes;i++) {
         Aspirante asp;
         
         String nombre = "Pedro Perez " + i;
         int cn = 10 + rn.nextInt(90);
         int cs = 10 + rn.nextInt(90);
         int len = 10 + rn.nextInt(90);
         int mat = 10 + rn.nextInt(90);
         
         
         if (i==200) {
            asp = new Aspirante(nombre, 99, 99, 99, 99);
         } else {
            if (i==400) {
               asp = new Aspirante(nombre, 1, 1, 1, 1);
            } else {
               asp = new Aspirante(nombre, cn, cs, len, mat);   
            }            
         }
         aspirantes[i] = asp;
         
         
      }
      
      Carrera sistemas = new Carrera("Ing Sistemas", 0.25, 0.2, 0.2, 0.3, 75.2);
      Carrera industrial = new Carrera("Ing Industrial", 0.2, 0.15, 0.35, 0.3, 74.5);
      Carrera medicina = new Carrera("Medicina", 0.3, 0.25, 0.25, 0.2, 81.5);      
      Carrera historia = new Carrera("Historia", 0.1, 0.4, 0.35, 0.15, 66.7);
      Carrera economia = new Carrera("Economia", 0.1, 0.3, 0.2, 0.4, 70.4);
      
      for (int i = 0; i < numAspirantes; i++) {
         Aspirante temp = aspirantes[i];
         double puntajeSistemas = temp.calcularPuntaje(sistemas);
         double puntajeIndustrial = temp.calcularPuntaje(industrial);
         double puntajeMedicina = temp.calcularPuntaje(medicina);
         double puntajeHistoria = temp.calcularPuntaje(historia);
         double puntajeEconomia = temp.calcularPuntaje(economia);
         
         System.out.println(temp.getNombre());
         System.out.println(sistemas.getNombre() + " " + puntajeSistemas);
         System.out.println(industrial.getNombre()  + " " + puntajeIndustrial);
         System.out.println(medicina.getNombre()  + " " + puntajeMedicina);
         System.out.println(historia.getNombre()  + " " +  puntajeHistoria);
         System.out.println(economia.getNombre()  + " " +  puntajeEconomia);
         System.out.println();
      }
      
      // Complete aqui el codigo

   }

}
