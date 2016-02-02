package co.edu.uis.api;

public interface Movable {

   /*
    * Mueve el elemento hacia arriba
    */
   public void moveUp();
   
   /*
    * Mueve el elemento hacia abajo
    */
   public void moveDown();
   
   /*
    * Mueve el elemento hacia la derecha
    */
   public void moveRight();
   
   /*
    * Mueve el elemento hacia la izquierda
    */
   public void moveLeft();
   
   /*
    * Imprime la posicion del elemento
    */
   public void printPosition();
   
}
