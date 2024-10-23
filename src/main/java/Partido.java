import java.util.Date;

public class Partido {
	private String resultado;
	private Date fecha;
	private Cancha cancha;
	private Equipo equipoRival;
	private Equipo equipoPrincipal;

	public Partido(String resultado, Date fecha, Cancha cancha, Equipo equipoRival, Equipo equipoPrincipal){
		this.resultado = resultado;
		this.fecha = fecha;
		this.cancha = cancha;
		this.equipoRival = equipoRival;
		this.equipoPrincipal = equipoPrincipal;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Equipo obtenerEquipoPrincipal() {
		return this.equipoPrincipal;
	}

	public Equipo obtenerEquipoRival() {
		return this.equipoRival;
	}

	public Cancha obtenerCancha() {
		return this.cancha;
	}

	public boolean asignarEquipoPrincipal(Equipo equipo) {
		if (this.equipoPrincipal == equipo){
			return false;
		}
		this.equipoPrincipal = equipo;
		return true;
	}

	public boolean asignarEquipoRival(Equipo equipo) {
		if (this.equipoRival == equipo){
			return false;
		}
		this.equipoRival = equipo;
		return true;
	}

	public boolean asignarCancha(Cancha cancha) {
		if (this.cancha == cancha){
			return false;
		}
		this.cancha = cancha;
		return true;
	}
}