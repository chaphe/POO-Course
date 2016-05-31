package p6;

public class ContenedorTriangulos {
   public Triangulo[] lista;
   public int cantidad;
   
   public ContenedorTriangulos() {
	   lista = new Triangulo[50];
	   cantidad = 0;
   }
   
   public void agregarTriangulo(Triangulo t) {
	   lista[cantidad] = t;
	   cantidad = cantidad + 1;
   }
}
