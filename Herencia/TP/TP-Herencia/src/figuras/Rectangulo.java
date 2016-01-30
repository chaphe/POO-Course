package figuras;

public class Rectangulo extends Figura {
	private double ancho;
	private double alto;
	
	public Rectangulo(double ancho, double alto, Punto p) {
		super(p);
		this.ancho = ancho;
		this.alto = alto;
		
	}
	
	public double area(){
		return ancho*alto;
	}
	
	public double perimetro(){
		return 2*ancho+2*alto;
	}
	
	public String toString(){
		return "ancho= " + ancho + ", alto= " +alto;
	}
	

}
