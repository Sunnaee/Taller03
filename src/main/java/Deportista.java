public class Deportista {
	private String nombreDeportista;
	private String apellidoDeportista;
	private String contacto;
	private Equipo equipo;
	private Deporte deporte;

	public Deportista(String nombreDeportista, String apellidoDeportista, String contacto, Deporte deporte){
		this.nombreDeportista = nombreDeportista;
		this.apellidoDeportista = apellidoDeportista;
		this.contacto = contacto;
		this.deporte = deporte;
	}

	public String getNombreDeportista() {
		return this.nombreDeportista;
	}

	public void setNombreDeportista(String nombreDeportista) {
		this.nombreDeportista = nombreDeportista;
	}

	public String getApellidoDeportista() {
		return this.apellidoDeportista;
	}

	public void setApellidoDeportista(String apellidoDeportista) {
		this.apellidoDeportista = apellidoDeportista;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Deporte obtenerDeporte() {
		return this.deporte;
	}
}