package test3;

public class Principal {

   public static void main(String[] args) {
      Alfa a1 = new Alfa();
      Alfa a2 = new Beta();
      Beta b1 = new Beta();

      System.out.println(a1.m1(""));
      System.out.println(a2.m1(5));
      System.out.println(b1.m1(""));
      System.out.println(a1.m1());
      System.out.println(a2.m1("a"));
      System.out.println(b1.m1());
      System.out.println(a1.m1());
      System.out.println(a2.m1(3));
      System.out.println(b1.m1(5));
   }

}
