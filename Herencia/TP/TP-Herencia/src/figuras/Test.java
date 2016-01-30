package figuras;

public class Test {
	public static void main(String[] args){

		Punto p1 = new Punto(2,2);
		Rectangulo r1 = new Rectangulo(4.1,5.2,p1);
		Rectangulo r2 = r1;
		
		System.out.println(r1);	
		System.out.println(r2);
	}

}
