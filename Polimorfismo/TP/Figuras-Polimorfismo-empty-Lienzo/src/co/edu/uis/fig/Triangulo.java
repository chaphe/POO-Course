package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Triangulo extends Figura {

	public Triangulo(int x, int y, Color color, int base, int altura) {
		
	}

	public void dibujar(Imagen img) {

		int xf = getX() + base;
		int yf = getY() + altura;

		for (int i = getX(); i < xf; i++) {
			img.setColor(i, yf, getColor());
		}

		for (int j = getY(); j < yf; j++) {
			img.setColor(getY(), j, getColor());
		}

		// diagonal
		for (double k = 0; k < 1.0; k += 0.01) {
			double l = getX() + k * base;
			double p = getY() + k * altura;
			img.setColor((int) l, (int) p, getColor());
		}
		img.mostrar();
	}
}
