package figuras;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double radio, Punto p) {
		super(p);
		this.radio = radio;
	}
	
	
	public double area(){
		return radio*radio*3.1416;
	}
	
	
	public double perimetro(){
		return 2*3.1416*radio;
	}
	
	

}
