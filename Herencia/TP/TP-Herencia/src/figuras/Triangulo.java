package figuras;

public class Triangulo extends Figura{
	private double altura;
	private double base;
	
	public Triangulo(Punto pos, double altura, double base) {
		super(pos);
		this.altura = altura;
		this.base = base;
	}
	
	public double area(){
		return (base*altura)/2;
	}
	
	public double perimetro(){
		double hip = Math.sqrt((base*base) + (altura+altura));
		return base+altura+hip;
	}

}
