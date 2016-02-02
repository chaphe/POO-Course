package co.edu.uis;

import co.edu.uis.sistemas.Persona;

public class ClientePersona2 {
   
   public void metodoSimple() {
      Persona per = new Persona();
      per.setNombre("Juan");
      per.setApellido("Perez");
     // per.validar("Juan");
      String nombrePer = per.getNombre();
      String apellidoPer = per.getApellido();
   }

}
