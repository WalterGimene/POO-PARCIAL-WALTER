package biblioteca;

public class RevistaCientifica extends Material{
	private String areaCientifica;
	
	
	//constructor//

	public RevistaCientifica() {
		super();
	
	}

	public RevistaCientifica(int codigo, String autor, String titulo, int anio, String estado) {
		super(codigo, autor, titulo, anio, estado);
		
	}

	public String getAreaCientifica() {
		return areaCientifica;
	}

	public void setAreaCientifica(String areaCientifica) {
		this.areaCientifica = areaCientifica;
	}

	@Override
	public String toString() {
		return "RevistaCientifica [areaCientifica=" + areaCientifica + "]";
	}
	
	
	
	

}
