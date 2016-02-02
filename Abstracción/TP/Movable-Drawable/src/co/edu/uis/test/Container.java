package co.edu.uis.test;

import java.util.ArrayList;
import java.util.List;

import co.edu.uis.api.Drawable;
import co.edu.uis.api.Movable;
import co.edu.uis.img.Imagen;

public class Container {

   private List elements;
   private Imagen img;
   
   public Container() {
      super();
      elements = new ArrayList();
      img = new Imagen(800, 800);
   }

   public void add(Movable mov) {
      elements.add(mov);
   }
   
   public void moveUp() {
      for (Object obj : elements) {
         Movable mov = (Movable)obj;
         mov.moveUp();
      }
   }
   
   public void moveDown() {
      for (Object obj : elements) {
         Movable mov = (Movable)obj;
         mov.moveDown();
      }
   }   
   
   public void moveRight() {
      for (Object obj : elements) {
         Movable mov = (Movable)obj;
         mov.moveRight();
      }
   }
   
   public void moveLeft() {
      for (Object obj : elements) {
         Movable mov = (Movable)obj;
         mov.moveLeft();
      }
   }
   
   public void print() {
      for (Object obj : elements) {
         Movable mov = (Movable)obj;
         mov.printPosition();
      }
   }
   
   public void draw() {
      for (Object obj : elements) {
         Drawable temp = (Drawable)obj;
         temp.draw(img);
      }
   }
}
