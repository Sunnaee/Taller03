import java.util.ArrayList;

public class Cancha {
	private String nombreCancha;
	private String tipoSuperficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private boolean reservada;
	private ArrayList<Partido> partidos = new ArrayList<Partido>();

	public Cancha(String nombreCancha, String tipoSuperficie, String ubicacion, int capacidadEspectadores, boolean reservada, ArrayList<Partido> partidos){
		this.nombreCancha = nombreCancha;
		this.tipoSuperficie = tipoSuperficie;
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
		this.reservada = reservada;
		this.partidos = partidos;
	}

	public String getNombreCancha() {
		return this.nombreCancha;
	}

	public void setNombreCancha(String nombreCancha) {
		this.nombreCancha = nombreCancha;
	}

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public boolean getReservada() {
		return this.reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	public ArrayList<Partido> obtenerPartidos(){
		return this.partidos;
	}

	public boolean agregarPartido(Partido partido){
		for (Partido partidosEnLista : this.partidos){
			if (partidosEnLista == partido){
				return false;
			}
		}
		partidos.add(partido);
		return true;
	}
}