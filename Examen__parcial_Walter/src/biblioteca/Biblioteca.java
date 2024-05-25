package biblioteca;


public class Biblioteca {
	private String nombre,horario;
	private int numero_prestamos = 0;
	private Material[] material = new Material[10];
	private Persona [] personas = new Persona[10];
	private Prestamo[] prestamos = new Prestamo[10];
	
	//constructor//

	public Biblioteca() {
		nombre = "BiblioTodo";
		horario = "Lunes a Viernes de 08:00 a 17:00";
		material[0] = new Libro( 222, "Juan Valinotti","La selva",2000, "disponible");
		personas[0] = new Alumno(462, "Walter Gimenez", "0985456123", "walter_matias@gmail.com", 5000);
		
		prestarMaterial(material[0], personas[0]);
		verMaterialesPrestados();
	}
	private void verMaterialesPrestados() {
		System.out.println(prestamos[0].toString());
	}
	private void prestarMaterial(Material m, Persona p) {
		prestamos[numero_prestamos] = new Prestamo(m, p, "24/05/24", 10);
		numero_prestamos++;
				
	}
	public static void main(String[]args) {
		new Biblioteca();
	}
	
	
	
	
	
	
	
	
	
	
	

}
