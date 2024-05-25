package biblioteca;

public class Profesor extends Persona {
private String especialidad;

public Profesor() {
	super();
}

public Profesor(int cedula, String nombreApellido, String correo, String telefono, String especialidad) {
	super(cedula, nombreApellido, correo, telefono);
	this.especialidad = especialidad;
}

@Override
public String toString() {
	return "Profesor [especialidad=" + especialidad + "]";
}




	



}
