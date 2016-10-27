package per.t3.cliente;

import per.t3.Persona;

public class ClientePersona3 {

	public void metodoSimple() {
		Persona per = new Persona();
		per.setNombre("Juan");
		per.setEdad(21);
		per.validar("Juan");
		String nombrePer = per.getNombre();
		int edadPer = per.edad;
		System.out.println("Nombre : " + nombrePer);
		System.out.println("Edad : " + edadPer);

	}

}
