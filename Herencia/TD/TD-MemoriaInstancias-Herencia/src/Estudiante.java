public class Estudiante extends Persona {

   private Direccion dir;
   
   public Estudiante(String nombre, int edad) {
      super(nombre, edad);
   }
   
   public Estudiante(String nombre, int edad, Direccion dir) {
      this(nombre, edad);
      this.dir = dir;
   }

   public Estudiante(String nombre, int edad, String texto, String barrio) {
      this(nombre, edad);
      this.dir = new Direccion(texto, barrio);
   }

   public Direccion getDir() {
      return dir;
   }

   public void setDir(Direccion dir) {
      this.dir = dir;
   }
   
   public Direccion getDirClon() {
      String texto = dir.getTexto();
      String barrio = dir.getBarrio();
      String ciudad = dir.getCiudad();
      Direccion tempDir = new Direccion(texto, barrio, ciudad);
      return tempDir;
   }
   
}
