public class Estudiante {
   
   public String nombre;
   public int codigo;
   public int nivel;
   public double[] promedios;

   public void inicializar(String nom, int cod, int niv) {
      nombre = nom;
      codigo = cod;
      nivel = niv;
      promedios = new double[10];
   }

   public double calcularPromedio() {
      double sum = 0.0;
      for (int i = 0; i < nivel; i++) {
         sum = sum + promedios[i];
      }
      return sum / nivel;
   }
   
}