package biblioteca;

public abstract class Persona {
	private int cedula;
	private String nombreApellido;
	private String correo;
	private String telefono;
	
	
	//Constructor//
	
	public Persona(int cedula, String nombreApellido, String correo, String telefono){
		this.cedula = cedula;
		this.nombreApellido = nombreApellido;
		this.correo = correo;
		this.telefono = telefono;
	}
	//get y set//
	public Persona() {
		super();
		
	}
	public int getcedula() {
		return cedula;
	}
	public void setcedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String getnombreApellido() {
		return nombreApellido;
	}
	public void stnombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	
	public String getcorreo(){
		return correo;
	}
	public void setcorreo(String correo) {
		this.correo = correo;
	}
	public String gettelefono() {
		return telefono;
	}
	public void settelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombreApellido=" + nombreApellido + ", correo=" + correo + ", telefono="
				+ telefono + "]";
	}
	
	}
	
	
	





