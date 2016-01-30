package test2;

import test1.Estudiante;

public class EstudiantePostgrado extends Estudiante {

   private int codAux;
   
   public EstudiantePostgrado(int codigo, String nombre, String apellido) {
      super(codigo, nombre, apellido);
   }

   public String toString() {
      return "EP - Nombre: " + getNombre() + " Apellido " + getApellido()  + 
            " Codigo " + getCodigo() + " cod auxliatura" + codAux;
   }
   
   
}
