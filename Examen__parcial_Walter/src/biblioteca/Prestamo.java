package biblioteca ;

public class Prestamo  {
private Material material;
private Persona prestatario;
private String fechaSalida;
private int fechaRegreso;


//constructor//

public Prestamo() {
	super();
}

public Prestamo(Material material, Persona prestatario, String fechaSalida, int fechaRegreso) {
	super();
	this.material = material;
	this.prestatario = prestatario;
	this.fechaSalida = fechaSalida;
	this.fechaRegreso = fechaRegreso;
}
//get y set//

public Material getMaterial() {
	return material;
}

public void setMaterial(Material material) {
	this.material = material;
}

public Persona getPrestatario() {
	return prestatario;
}

public void setPrestatario(Persona prestatario) {
	this.prestatario = prestatario;
}

public String getFechaSalida() {
	return fechaSalida;
}

public void setFechaSalida(String fechaSalida) {
	this.fechaSalida = fechaSalida;
}

public int getFechaRegreso() {
	return fechaRegreso;
}

public void setFechaRegreso(int fechaRegreso) {
	this.fechaRegreso = fechaRegreso;
}

@Override
public String toString() {
	return "Prestamo [material=" + material + ", prestatario=" + prestatario + ", fechaSalida=" + fechaSalida
			+ ", fechaRegreso=" + fechaRegreso + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}

