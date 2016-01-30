public class Persona {

   private String nombre;
   private int edad;
   private Direccion dir;

   public Persona(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
   }

   public Persona(String nombre, int edad, Direccion dir) {
      this.nombre = nombre;
      this.edad = edad;
      this.dir = dir;
   }

   public Persona(String nombre, int edad, String texto, String barrio) {
      this.nombre = nombre;
      this.edad = edad;
      this.dir = new Direccion(texto, barrio);
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public Direccion getDir() {
      return dir;
   }

   public void setDir(Direccion dir) {
      this.dir = dir;
   }
}
