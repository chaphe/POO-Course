
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangulo
{

    public int ancho;
    public int alto;

    public void inicializar(int an, int al) {
        ancho = an;
        alto = al;
    }
    
    public int area() {
        int temp = 0;
        temp = ancho * alto;
        return temp;
    }
    
    public int perimetro() {
        int temp = 0;
        temp = (2 * ancho)  + (2 * alto);
        return temp;
    }    

}
