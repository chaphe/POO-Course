package co.edu.uis;

import co.edu.uis.sistemas.Persona;

public class ClientePersona1 {
   
   public void metodoSimple() {
      Persona per = new Persona();
      per.setNombre("Juan");
      per.setApellido("Perez");
      String nombrePer = per.getNombre();
      String apellidoPer = per.getApellido();
   }

}
