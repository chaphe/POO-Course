package co.edu.uis.sistemas;

public class Persona {

   private String nombre;
   private String apellido;

   public Persona() {
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nNombre) {
      boolean valido = validar(nNombre);
      if (valido) {
         nombre = nNombre;
      }
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String nApellido) {
      boolean valido = validar(nApellido);
      if (valido) {
         apellido = nApellido;
      }
   }

   private boolean validar(String texto) {
      char[] vetorTexto = texto.toCharArray();
      for (int i = 0; i < vetorTexto.length; i++) {
         if (vetorTexto[i] == ' ') {
            return false;
         }
      }
      return false;
   }
   
   private boolean validar(String texto, int max) {
      if (texto.length() <= max) {
         char[] vetorTexto = texto.toCharArray();
         for (int i = 0; i < vetorTexto.length; i++) {
            if (vetorTexto[i] == ' ') {
               return false;
            }
         }         
      }              
      return false;
   }
   
   private void dummy(String nombre) {
      int maximo = 200;      
      validar(nombre, maximo);
   }
   
   
}
