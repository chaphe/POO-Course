package co.edu.uis.fig;

import java.awt.Color;

import co.edu.uis.img.Imagen;

public class Linea extends Figura
{

    private int longitud;

 
 
    public Linea(int x, int y, int longitud){
    	super(x, y);
        this.longitud = longitud;
    }
 
    public void dibujar(Imagen img){
        Color c = new Color(0, 0, 0); // Color negro
        int xf = (this.getX())+(this.longitud);//Calcula el punto final
        for (int i = getX(); i<xf; i++){
            img.setColor(i, getY() ,c);//colorea el punto manteniendo la altura constante
        }
        img.mostrar();  //Muestra el dibujo en la ventana
    }
 
}