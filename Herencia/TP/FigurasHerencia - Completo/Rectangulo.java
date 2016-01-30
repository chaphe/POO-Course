import java.awt.Color;

public class Rectangulo extends Figura {
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, Color color, int ancho, int alto) {
        super(x, y, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * ancho + 2 * alto;
    }

}
