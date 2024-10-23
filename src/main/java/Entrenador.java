public class Entrenador {
	private String nombreEntrenador;
	private String experiencia;
	private Equipo equipo;
	private Deporte deporte;

	public Entrenador(String nombreEntrenador, String experiencia, Deporte deporte){
		this.nombreEntrenador = nombreEntrenador;
		this.experiencia = experiencia;
		this.deporte = deporte;
	}

	public String getNombreEntrenador() {
		return this.nombreEntrenador;
	}

	public void setNombreEntrenador(String nombreEntrenador) {
		this.nombreEntrenador = nombreEntrenador;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public Deporte obtenerDeporte() {
		return this.deporte;
	}
}