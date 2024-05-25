package biblioteca;

public class Alumno extends Persona{
	private int matricula;
	
	//constructor//

	public Alumno() {
		super();
	}
	
	
	public Alumno(int cedula, String nombreApellido, String correo, String telefono, int matricula) {
		super(cedula, nombreApellido, correo, telefono);
		this.matricula = matricula;
	}


	
	
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + "]";
	}
	
	

}
