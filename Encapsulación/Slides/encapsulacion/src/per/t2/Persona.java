package per.t2;

public class Persona {

	private String nombre;
	private int edad;

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nNombre) {
		boolean valido = validar(nNombre);
		if (valido) {
			nombre = nNombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int ed) {
		this.edad = ed;
	}

	private boolean validar(String texto) {
		return true;
	}

}
