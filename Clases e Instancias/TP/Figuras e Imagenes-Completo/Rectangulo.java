import java.awt.Color;

/**
 * Esta clase permite: 
 * <p>
 * 1). crear y dibujar un rectangulo con origen en la posicion (x,y).
 * <p>
 * 2). determinar si el rectangulo puede contener una instancia de la clase Triangulo o una instancia de la clase Circulo.
 * 
 * @author Gabriel Pedraza
 * @author Monica L. Hernandez
 * @version 28 Octubre 2014
 */

public class Rectangulo
{
    private int ancho;
    private int alto;
    private int x;
    private int y;
    
    /**
     * Constructor crea un rectangulo de dimensiones (ancho, alto)
     * @param ancho El ancho del rectangulo
     * @param alto La altura del rectangulo
     * @param x,y La posición del rectangulo
     */
    public Rectangulo(int ancho, int alto, int x, int y){
        this.ancho = ancho;
        this.alto = alto;  
        this.x = x;
        this.y = y;
    }
    
    /**
     * Determina si una instancia de la clase Triangulo puede
     * estar contenido dentro de la instancia de la clase Rectangulo
     * @param t Instancia de la clase Triangulo
     * @return true Si la instancia rectangulo puede contener a la instancia triangulo (t), de lo contrario false
     * @see Triangulo
     */
    public boolean puedeContenerTriangulo(Triangulo t) {
        if ((t.getBase() <= this.ancho) && (t.getAltura()<=this.alto)){
            return true;
        }
        else
            return false;
    }
    
    /**
     * Determina si una instancia de la clase Circulo puede
     * estar contenido dentro de la instancia de la clase Rectangulo
     * @param c Instancia de la clase Circulo
     * @return true Si la instancia rectangulo puede contener a la instancia circulo (c), de lo contrario false
     * @see Circulo
     */
    public boolean puedeContenerCirculo(Circulo c) {
        if ((c.getRadio())*2<=this.alto && (c.getRadio())*2<=this.ancho){
            return true;
        }
        else
            return false;
    }
   
    /**
     * Dibuja la instancia  de la clase Rectangulo, usando puntos (x,y) como el origen
     * @param img Instancia a dibujar
     * @see Imagen
     */
    public void dibujar(Imagen img) {        
        Color c = new Color(0, 0, 0); // Color negro
        
        int xf = (this.x)+(this.ancho);
        int yf = (this.y)+(this.alto);
        
        for (int i = this.x; i<xf; i++) {
            img.setColor(i, this.y, c);
            img.setColor(i, yf, c);
        }
        
        for (int j = this.y; j<yf;j++){
            img.setColor(this.x, j, c);
            img.setColor(xf,j, c);
        }
        // Muestra el dibujo en la ventana
        img.mostrar(); 
    }
    

    
}
