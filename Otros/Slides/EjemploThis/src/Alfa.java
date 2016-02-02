
public class Alfa {
   
   private int id;

   public Alfa(int id) {
      this.id = id;
   }

   public void usandoBetaSimple(Beta unBeta) {
      unBeta.saludo();
   }
   
   public void usandoBetaConThis(Beta unBeta) {
      unBeta.usandoAlfa(this);
   }
   
   public void saludo() {
      System.out.println("Soy una instancia de Alfa " + id);
   }
   
}
