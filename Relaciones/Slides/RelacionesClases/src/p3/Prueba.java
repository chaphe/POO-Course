package p3;

public class Prueba {

	public static void main(String[] args) {
		Punto p1 = new Punto(10, 10);
		Triangulo t1 = new Triangulo(10, 20, p1);

		Punto p2 = new Punto(12, 34);
		Triangulo t2 = new Triangulo(15, 12, p2);
	}

}
