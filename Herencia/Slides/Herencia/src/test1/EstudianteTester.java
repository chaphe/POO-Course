package test1;

public class EstudianteTester {

   public static void main(String[] args) {
      Estudiante estu = new Estudiante(2020345, "Laura", "Lopez");
      System.out.println(estu.nombre);
      estu.codigo = 2021567;
   }

}
