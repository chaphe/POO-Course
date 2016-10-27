package per.t3.cliente;

import per.t3.Persona;


public class ClientePersona2 {
	
	public static void main(String[] args) {
	      Persona per = new Persona();
	      per.setNombre("Juan");
	      per.setEdad(21);
	      String nombrePer = per.getNombre();
	      int edadPer = per.getEdad();
	      System.out.println("Nombre : " + nombrePer);
	      System.out.println("Edad : " + edadPer);
	}

}
