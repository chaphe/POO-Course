package p4;

import p3.Punto;

public class Triangulo {

	public int base;
	public int altura;
	public Punto loc;
	
	public Triangulo(int b, int a, Punto p) {
		base = b;
		altura = a;
		loc = p;
	}
	
	public Triangulo(int b, int a, int xi, int yi) {
		base = b;
		altura = a;
		loc = new Punto(xi, yi);
	}

}
