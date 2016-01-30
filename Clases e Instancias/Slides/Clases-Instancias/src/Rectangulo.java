public class Rectangulo {
   
   public float ancho;
   public float alto;

   public void inicializar(float an, float al) {
      ancho = an;
      alto = al;
   }
   
   public float area() {
      return ancho * alto;
   }

   public float perimetro() {
      return (2 * ancho) + (2 * alto);
   }
}
