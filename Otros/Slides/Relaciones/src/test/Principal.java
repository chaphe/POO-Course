package test;

public class Principal {

   public static void main(String[] args) {
      Estudiante est1, est2, est3;
      Direccion dir1, dir2;
      
      est1 = new Estudiante("Juan Perez", 5);
      
      dir1 = new Direccion("Cle 20 No 30-45", "Chapinero", "Bogota");
      
      est2 = new Estudiante("Pedro Lopez", 8, dir1);
      
      dir2 = new Direccion("Cle 10 No 20-30", "Santana", "Medellin");
      
      est3 = new Estudiante("Pablo Perez", 3, dir2);
      
      est1.setDir(dir2);
      
      est1.imprimir();
      est2.imprimir();
      est3.imprimir();
   }

}
