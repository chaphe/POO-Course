package co.edu.uis.plano;

import co.edu.uis.img.Imagen;

public interface ObjectoEnPlano {

   public void setPosicion(int x, int y);
   
   public void imprimirPosicion();
   
   public void dibujar(Imagen img);
}
