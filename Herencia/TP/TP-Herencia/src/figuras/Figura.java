package figuras;

public class Figura {
	protected Punto pos;
	
	
	
	public Figura(Punto pos) {
		super();
		this.pos = pos;
	}

	public double area(){
		return 0.0;
	}
	
	public double perimetro(){
		return 0.0;
	}
	
	public void desplazar(int deltaX, int deltaY){
		pos.desplazar(deltaX, deltaY);
	}

}
