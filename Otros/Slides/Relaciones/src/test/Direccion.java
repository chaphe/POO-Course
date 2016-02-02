package test;

public class Direccion {

   private String texto;
   private String barrio;
   private String ciudad;
   
   public Direccion(String texto, String barrio, String ciudad) {
      this.texto = texto;
      this.barrio = barrio;
      this.ciudad = ciudad;
   }

   public String getTexto() {
      return texto;
   }

   public void setTexto(String texto) {
      this.texto = texto;
   }

   public String getBarrio() { return barrio; }

   public void setBarrio(String barrio) { this.barrio = barrio; }

   public String getCiudad() { return ciudad; }

   public void setCiudad(String ciudad) { this.ciudad = ciudad; }  
   
}
