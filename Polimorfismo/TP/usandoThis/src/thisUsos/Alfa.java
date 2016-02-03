package thisUsos;

public class Alfa {
	
	private int a;
	private int b;
	
	public Alfa(int a, int b){
		this.a = a;
		this.b = b;		
	}
	
	public Alfa(int a){
		this.a = a;
		b=0;		
	}
	
	public void m1(){
		System.out.println("El valor de a es: " + a);
	}
	
	public void m2(){
		System.out.println("Este es el metodo m2 de Alfa");
		//m1();
	}
	
	public void prueba(Alfa a){
		a.m1(); //llama al metodo m1 con la instancia a
		this.m1(); //llama al metodo m1 con la instancia que invoca el metodo en el main
					//ejemplo a1.m1(a2), llama el metodo con a1
		
	}

}
