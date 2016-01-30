public class Principal {

   public static void main(String[] args) {

      // Inicio Bloque 1
      Direccion dir1 = new Direccion("Cle 15 No 20-30", "Centro");
      Estudiante est1 = new Estudiante("Juan Perez", 20, dir1);
      // Fin Bloque 1
      
      // Inicio Bloque 2
      Estudiante est2 = new Estudiante("P Lopez", 21, "Av 12 No 5-80", "Aurora");
      // Inicio Bloque 2
      
      // Inicio Bloque 3
      est2.setDir(est1.getDir());
      est2.setEdad(22);
      // Fin Bloque 3

      // Inicio Bloque 4
      Estudiante est3 = new Estudiante("Carlos Flores", 19);
      est3.setDir(new Direccion("Crra 50 No 5-82", "Sotomayor"));      
      // Fin Bloque 4
      
      // Inicio Bloque 5
      Direccion dir3 = new Direccion("Calle 15 No 20-30", "Centro", "Medellin");
      est3.setDir(dir3);
      est3.getDir().setCiudad("Bogota");
      // Fin Bloque 5
      
      // Inicio Bloque 6
      Direccion dir4 = new Direccion("Calle 15 No 20-30", "Centro", "Cali");
      est3.setDir(dir4);
      // Fin Bloque 6

   }

}
