package test2;

public class Carrera {
   private String nombre;
   private double porNaturales;
   private double porSociales;
   private double porLenguaje;
   private double porMatematicas;
   private double corte;

   public Carrera(String nombre, double porNaturales, double porSociales,
         double porLenguaje, double porMatematicas, double corte) {
      this.nombre = nombre;
      this.porNaturales = porNaturales;
      this.porSociales = porSociales;
      this.porLenguaje = porLenguaje;
      this.porMatematicas = porMatematicas;
      this.corte = corte;
   }

   public String getNombre() {
      return nombre;
   }

   public double getPorNaturales() {
      return porNaturales;
   }

   public double getPorSociales() {
      return porSociales;
   }

   public double getPorLenguaje() {
      return porLenguaje;
   }

   public double getPorMatematicas() {
      return porMatematicas;
   }

   public void setPorMatematicas(double porMatematicas) {
      this.porMatematicas = porMatematicas;
   }

   public double getCorte() {
      return corte;
   }

   public void setCorte(double corte) {
      this.corte = corte;
   }

}
