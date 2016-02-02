package co.edu.uis.sistemas;

public class Carro {

   private Color color;
   private String modelo;
   private int anho;
   
   public Carro(String modeloIni, int anhoIni) {
      modelo = modeloIni;
      anho = anhoIni; 
      color = new Color(0,0,0);
   }
   
   public Carro(String modeloIni, int anhoIni, int rojoIni, int azulIni, int verdeIni) {
      modelo = modeloIni;
      anho = anhoIni; 
      color = new Color(rojoIni, verdeIni, azulIni);
   }
   
   public void calcularRuta(Mapa mapa) {
      
   }
   
}
