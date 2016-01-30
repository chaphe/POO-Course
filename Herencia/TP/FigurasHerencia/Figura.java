import java.awt.Color;

public class Figura {

   private int x;
   private int y;
   private Color color;
   
   public Figura(int x, int y, Color color) {
      this.x = x;
      this.y = y;
      this.color = color;
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }

   public void trasladar(int deltaX, int deltaY) {
      this.x = this.x + deltaX;
      this.y = this.y + deltaX;
   }
   
   public double area() {
      return 0.0;
   }

   public double perimetro() {
      return 0.0;
   }
   
   public void dibujar(Imagen img) {
      
   }

}
