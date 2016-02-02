package test3;

public class Demo {

   public void lanzaA() throws ExcepcionA {
      throw new ExcepcionA();
   }
   
   public void lanzaB() throws ExcepcionB {
      throw new ExcepcionB();
   }
   
   public void lanzaC() throws ExcepcionC {
      throw new ExcepcionC();
   }
   
   public void lanzaD() throws ExcepcionD {
      throw new ExcepcionD();
   }
   
   private void test() {
      try {
         lanzaD();
         lanzaB();
      } catch (ExcepcionB  e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (ExcepcionD e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      

   }
   
}
