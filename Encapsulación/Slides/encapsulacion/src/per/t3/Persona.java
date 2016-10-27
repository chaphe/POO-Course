package per.t3;

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
      char[] vetorTexto = texto.toCharArray();
      for (int i = 0; i < vetorTexto.length; i++) {
         if (vetorTexto[i] == ' ') {
            return false;
         }
      }
      return false;
   }      
   
}
