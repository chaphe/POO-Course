package test;

public class Escuela {

   private String nombre;
   private Estudiante[] estudiantes;
   private int numEstudiantes;
   
   public Escuela(String nombre) {
      this.nombre = nombre;
      estudiantes = new Estudiante[200];
      numEstudiantes = 0;
   }
   
   public void agregarEstudiante(Estudiante est) {
      estudiantes[numEstudiantes] = est;
      numEstudiantes++;
   }
   
   public void imprimirNivel(int nivel) {
      for (int i = 0; i < numEstudiantes; i++) {
         Estudiante est = estudiantes[i];
         if (est.getNivel()==nivel) {
            est.imprimir();
         }
      }
   }

   public String getNombre() { return nombre; }
   public void setNombre(String nombre) { this.nombre = nombre; }
   
}
