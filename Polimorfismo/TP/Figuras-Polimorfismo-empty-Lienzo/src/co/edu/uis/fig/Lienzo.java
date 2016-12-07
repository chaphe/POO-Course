package co.edu.uis.fig;

import java.util.ArrayList;
import java.util.List;

import co.edu.uis.img.Imagen;
public class Lienzo {
	
	private List<Figura> figuras = new ArrayList<Figura>();
	private Imagen imagen;
	
	public Lienzo(){
		imagen = new Imagen(800,800);
		
	}
	
	public void agregarFigura(Figura fig){
		figuras.add(fig);
	}
	
	public void dibujar(){
		for (Figura figura : figuras) {
			figura.dibujar(imagen);
		}
		imagen.dibujar();
	}
}
