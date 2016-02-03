package thisUsos;

public class Beta extends Alfa{
	/*
	 * Con super solo puedo acceder un nivel de jerarqui hacia arriba
	 */
	private int c;
	
	public Beta(int a, int b, int c){
		super(a,b);
		this.c = c;
	}
	
	public void m2(){
		System.out.println("Este es el metodo m2 de Beta");
	}
	
	public void m3(){
		//m2(); //llama al metodo de esta clase
		//super.m2(); //llama al metodo de la superclase
		//m1(); //como m1 no esta redefinido, puedo llamar a m1 porque lo herede
		super.m1();//esto da lo mismo que hacer m1(), porque no lo he sobrescrito
	}

}
