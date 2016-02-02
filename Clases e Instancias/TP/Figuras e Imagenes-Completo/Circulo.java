import java.awt.Color;

/**
 * Esta clase permite crear y dibujar un circulo de radio r, con origen en la posicion (x,y).
 *
 * @author Gabriel Pedraza
 * @author Monica L. Hernandez 
 * @version 28 Octubre 2014
 */
public class Circulo
{

    private int radio;
    private int x;
    private int y;

    /**
     * Constructor crea un circulo de radio r
     * @param radio El radio r del circulo
     * @param x,y Posición del circulo
     */
    public Circulo(int radio, int x, int y) {
        this.radio = radio;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Obtiene el radio del circulo
     * @return el radio del circulo
     */   
    public int getRadio(){
        return radio;
    }
    
    /**
     * Dibuja la instancia de la clase Circulo, con origen en el punto (x,y)
     * @param img la instancia a dibujar
     * @see Imagen
     */
    public void dibujar(Imagen img) {
        Color c = new Color(0, 0, 0); // Color negro
        int xc = (this.x)+(this.radio);
        int yc = (this.y)+(this.radio);
        
        for (int i=0; i<=360; i++){
            int m = (int)(xc + (this.radio)*Math.cos(i));
            int n = (int)(yc + (this.radio)*Math.sin(i));
            img.setColor(m,n,c);
        }
        // Muestra el dibujo en la ventana
        img.mostrar();
    }

}
