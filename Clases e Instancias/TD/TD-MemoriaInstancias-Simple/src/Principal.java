public class Principal {

   public static void main(String[] args) {

      // Inicio Bloque 1
      Direccion dir1 = new Direccion("Cle 15 No 20-30", "Centro");
      Persona per1 = new Persona("Juan Perez", 20, dir1);
      
      System.out.println(dir1);
      // Persona per2 = new Persona("Pedro Perez", 50, dir1);
      // Fin Bloque 1
      
      // Inicio Bloque 2
      Persona per2 = new Persona("P Lopez", 21, "Av 12 No 5-80", "Aurora");
      // Inicio Bloque 2
      
      // Inicio Bloque 3
      per2.setDir(per1.getDir());
      per2.setEdad(22);
      // Fin Bloque 3

      // Inicio Bloque 4
      Persona per3 = new Persona("Carlos Flores", 19);
      per3.setDir(new Direccion("Crra 50 No 5-82", "Sotomayor"));      
      // Fin Bloque 4
      
      // Inicio Bloque 5
      Direccion dir3 = new Direccion("Calle 15 No 20-30", "Centro", "Medellin");
      per3.setDir(dir3);
      per3.getDir().setCiudad("Bogota");
      // Fin Bloque 5
      
      // Inicio Bloque 6
      Direccion dir4 = new Direccion("Calle 15 No 20-30", "Centro", "Cali");
      per3.setDir(dir4);
      // Fin Bloque 6

   }

}
