import java.awt.Color;

/**
 * Esta clase permite crear y dibujar un triangulo con origen en la posicion (x,y).
 * 
 * @author Gabriel Pedraza
 * @author Monica L. Hernandez 
 * @version 28 Octubre 2014
 */
public class Triangulo
{
    private int base;
    private int altura;
    private int x;
    private int y;
    
    /**
     * Constructor crea un triangulo de dimensiones (base, altura)
     * @param base La base (ancho) del triangulo
     * @param altura La altura del triangulo
     * @param x,y posición del triangulo
     */
    public Triangulo(int base, int altura, int x, int y){
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }
    
    /**
     * Obtiene la base del triangulo
     * @return la base del triangulo
     */
    public int getBase(){
        return base;
    }
    
    /**
     * Obtiene la altura del triangulo
     * @return la altura del triangulo
     */   
    public int getAltura(){
        return altura;
    }

    /**
     * Dibuja la instancia de la clase Triangulo, usando puntos (x,y) como origen
     * @param img la instancia a dibujar
     * @see Imagen
     */
    public void dibujar(Imagen img) {
        Color c = new Color(0, 0, 0); // Color negro
        int xf = (this.x)+(this.base);
        int yf = (this.y)+(this.altura);
        
        for (int i = this.x; i<xf; i++) {
            img.setColor(i, yf, c);
        }
        
        for (int j = this.y; j<yf; j++) {
            img.setColor(this.x, j, c);
        }
        
        //diagonal 
        for (double k=0; k<1.0; k +=0.01 ){
            double l = (this.x) + k*this.base;
            double p = (this.y) + k*this.altura;
            img.setColor((int)l, (int)p, c);
        }
        
        // Muestra el dibujo en la ventana
        img.mostrar();
    }

}
