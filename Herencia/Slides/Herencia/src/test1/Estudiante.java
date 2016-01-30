package test1;

public class Estudiante {

   private int codigo;
   private String nombre;
   private String apellido;
   
   public Estudiante(int codigo, String nombre, String apellido) {
      this.codigo = codigo;
      this.nombre = nombre;
      this.apellido = apellido;
   }

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int cod) {
      codigo = cod;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nom) {
      nombre = nom;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

}
