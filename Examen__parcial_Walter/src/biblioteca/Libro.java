package biblioteca;

public class Libro extends Material {
	private String editorial;
	

	public Libro() {
		super();
	}


	public Libro(int codigo, String autor, String titulo, int anio, String estado) {
		super(codigo, autor, titulo, anio, estado);
	}


	public Libro(String editorial) {
		super();
		this.editorial = editorial;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	@Override
	public String toString() {
		return "Libro [editorial=" + editorial + ", getCodigo()=" + getCodigo() + ", getAutor()=" + getAutor()
				+ ", getTitulo()=" + getTitulo() + ", getAnio()=" + getAnio() + ", getEstado()=" + getEstado()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	
	
}
