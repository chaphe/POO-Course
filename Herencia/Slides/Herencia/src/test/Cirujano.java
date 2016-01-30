package test;

public class Cirujano extends Medico {

   // Método sobrescito
   public void tratarPaciente() {
      System.out.println("Realizar una cirugia"); 
   }
   
   // Método adicional
   public void realizarIncision() {
      System.out.println("usando el escalpelo");
   }
   
}
