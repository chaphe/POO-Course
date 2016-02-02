package test;

public class Estudiante {

   private String nombre;
   private int nivel;
   private Direccion dir;

   public Estudiante(String nombre, int nivel) {
      this.nombre = nombre;
      this.nivel = nivel;
   }

   public Estudiante(String nombre, int nivel, Direccion dir) {
      this.nombre = nombre;
      this.nivel = nivel;
      this.dir = dir;
   }

   public int getNivel() {
      return nivel;
   }

   public void setNivel(int nivel) {
      this.nivel = nivel;
   }

   public Direccion getDir() {
      return dir;
   }

   public void setDir(Direccion dir) {
      this.dir = dir;
   }

   public void imprimir() {
      System.out.println("Nombre : " + nombre);
      System.out.println("Nivel : " + nivel);
      System.out.println("Direccion : ");
      System.out.println(dir.getTexto());
      System.out.println(dir.getBarrio() + ", " + dir.getCiudad());
   }

}
