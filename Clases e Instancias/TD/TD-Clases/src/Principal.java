public class Principal {

   public static void main(String[] args) {

      // Define un vector de Estudiantes y lo inicializa con 30 elementos
      Estudiante[] estudiantes = new Estudiante[30];
      // Variable que tendra el numero de estudiantes en el vector
      int numEstudiantes = 0;

      // Define la variable est1 de tipo Estudiante
      Estudiante est1;
      // Crea una instancia de Estudiante
      est1 = new Estudiante();
      // Modifica el atributo nombre de la instancia est1
      est1.nombre = "Jorge Perez";
      // Modifica el atributo codigo de la instancia est1
      est1.codigo = 2102040;
      // Modifica el atributo nivel de la instancia est1
      est1.nivel = 3;
      // inicializa el atributo promedios (vactor) de est1
      est1.promedios = new double[10];
      // Modifica 3 elementos del atributo promedios de est1
      est1.promedios[0] = 2.2;
      est1.promedios[1] = 4.5;
      est1.promedios[2] = 3.5;

      // Agrega la instancia al vector
      estudiantes[numEstudiantes] = est1;
      // Aumenta el numero de estudiantes
      numEstudiantes++;

      // Crea una nueva instancia de Estudiante y la agrega al vector
      Estudiante est2 = new Estudiante();
      est2.nombre = "Juan Lopez";
      est2.codigo = 2102041;
      est2.nivel = 2;
      est2.promedios = new double[10];
      est2.promedios[0] = 2.5;
      est2.promedios[1] = 4.8;

      estudiantes[numEstudiantes] = est2;
      numEstudiantes++;

      /*
       * El codigo a completar debe funcionar con cualquier numero de
       * estudiantes entre 0 y 30 (tamaño maximo del vector).
       */

      // Este bloque de codigo imprime el nombre y promedio de cada estudiante
      System.out.println("Estudiantes y promedio");
      for (int i = 0; i < numEstudiantes; i++) {
         Estudiante est = estudiantes[i];
         double promedio = est.calcularPromedio();
         System.out.println(est.nombre + " - Promedio - " + promedio);
      }

      // Complete a partir de aqui el codigo faltante

   }

}
