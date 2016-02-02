
public class Beta {

   private int id;
   
   public Beta(int id) {
      this.id = id;
   }
   
   public void saludo() {
      System.out.println("Soy una instancia de Beta " + id);
   }
   
   public void usandoAlfa(Alfa alfa) {
      alfa.saludo();
   }
   
}
