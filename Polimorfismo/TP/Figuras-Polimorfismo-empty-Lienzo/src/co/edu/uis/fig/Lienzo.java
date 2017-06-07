package co.edu.uis.fig;

import co.edu.uis.img.Imagen;
public class Lienzo {
	
	private Figura[] figuras = new Figura[50]; 
	private Imagen imagen;
	private int numFigs;
	
	public Lienzo(){
		imagen = new Imagen(800,800);
		numFigs = 0;
		
	}
	
	public void agregarFigura(Figura fig){
		figuras[numFigs]=fig;
		numFigs++;
	}
	
	public void dibujar(){
		for (int i=0; i<numFigs;i++) {
			figuras[i].dibujar(imagen);
		}
		imagen.mostrar();
	}

}
