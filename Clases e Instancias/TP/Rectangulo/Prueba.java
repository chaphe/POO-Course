
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{

    public static void main(String[] args)
    {
        Rectangulo r1 = new Rectangulo();
        
        r1.inicializar(10, 20);
        
        int arear1 = r1.area();        
        System.out.println("El area de r1 es " + arear1);

        int perimetror1 = r1.perimetro();        
        System.out.println("El perimetro de r1 es " + perimetror1);

        
    }
}
