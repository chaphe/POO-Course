package test2;

public class Aspirante {

   private String nombre;
   private int puntajeNaturales;
   private int puntajeSociales;
   private int puntajeLenguaje;
   private int puntajeMatematicas;
   
   public Aspirante(String nombre, int puntajeNaturales, int puntajeSociales,
         int puntajeLenguaje, int puntajeMatematicas) {
      this.nombre = nombre;
      this.puntajeNaturales = puntajeNaturales;
      this.puntajeSociales = puntajeSociales;
      this.puntajeLenguaje = puntajeLenguaje;
      this.puntajeMatematicas = puntajeMatematicas;
   }
   
   public double calcularPuntaje(Carrera car) {
      double puntaje = 0.0;
      puntaje = car.getPorNaturales() * puntajeNaturales;
      puntaje = puntaje + car.getPorSociales() * puntajeSociales;
      puntaje = puntaje + car.getPorLenguaje() * puntajeLenguaje;
      puntaje = puntaje + car.getPorMatematicas() * puntajeMatematicas;
      return puntaje;
   }
   
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
   
}
