package animal2;

public class TestAnimal {
   
   private void test1() {
      Canino can1 = new Canino();      
      Lobo lobo1 = new Lobo();
      
      can1.hacerRuido();      
      can1 = lobo1;      
      can1.hacerRuido();
   }
   
   /*
   private void test2() {
      Canino can1 = new Canino();      
      Lobo lobo1 = new Lobo();

      lobo1.hacerRuido();
      lobo1 = can1;
      lobo1.hacerRuido();      
   }
   */
   
   private void test3() {
      Canino can1 = new Canino();      
      Lobo lobo1 = new Lobo();

      lobo1.hacerRuido();
      lobo1 = (Lobo) can1;
      lobo1.hacerRuido();      
   }
   
   private void test4() {
      Canino can1 = new Lobo();      
      Lobo lobo1 = new Lobo();

      lobo1.hacerRuido();
      lobo1 = (Lobo) can1;
      lobo1.hacerRuido();      
   }
   
   
   public void testAsc() {
      Lobo lobito = new Lobo();
      Animal animalito = null;
      Canino caninito = null;
      animalito = lobito;
      animalito = new Canino();
      caninito = lobito;
      animalito = new Animal();
   }
   
   
   public void testDes() {
      Lobo lobito = null;
      Animal animalito = new Lobo();
      lobito = (Lobo) animalito;
      animalito = new Animal();
      lobito = (Lobo) animalito;
   }
   
   public void testDinamico() {
      Animal[] animales = new Animal[4];
      
      animales[0] = new Perro();
      animales[1] = new Lobo();
      animales[2] = new Gato();
      animales[3] = new Leon();
      
      for (int i = 0; i < animales.length; i++) {
         animales[i].hacerRuido();
      }
      
      for (Animal animal : animales) {
         animal.hacerRuido();
      }
   }
   
   
   
   
   public static void main(String[] args) {
      
      TestAnimal test = new TestAnimal();
      
      test.testDinamico();

   }

}
