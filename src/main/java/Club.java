import java.util.ArrayList;
import java.util.Date;

public class Club {
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	private ArrayList<Partido> partidos = new ArrayList<Partido>();

	public Club(ArrayList<Equipo> equipos, ArrayList<Partido> partidos){
		this.equipos = equipos;
		this.partidos = partidos;
	}

	public boolean registrarEquipo(Equipo equipo) {
		for (Equipo equipoEnLista : this.equipos){
			if (equipoEnLista != null) {
				if (equipoEnLista == equipo) {
					return false;
				}
			}
		}
		equipos.add(equipo);
		return true;
	}

	public boolean registrarDeportista(Equipo equipo, Deportista deportista) {
		if (!registrarEquipo(equipo)) { //si el equipo ya existe.
			if (!equipo.agregarDeportista(deportista)) { //si el deportista ya existe.
				return false;
			}
			equipo.agregarDeportista(deportista);
			return true;
		}
		equipos.add(equipo); //si el equipo no existe;
		equipo.agregarDeportista(deportista);
		return true;
	}

	public boolean registrarEntrenador(Equipo equipo, Entrenador entrenador) {
		if (!registrarEquipo(equipo)) { //si el equipo ya existe.
			if (!equipo.agregarEntrenador(entrenador)) { //si el entrenador ya existe.
				return false;
			}
			equipo.agregarEntrenador(entrenador);
			return true;
		}
		equipos.add(equipo); //si el equipo no existe;
		equipo.agregarEntrenador(entrenador);
		return true;
	}

	public boolean crearPartido(Equipo equipoP, Equipo equipoR, Cancha cancha, Date fecha) {
		Partido partido = new Partido("",fecha,cancha,equipoR,equipoP);
		partidos.add(partido);
		cancha.agregarPartido(partido);
	}

	public boolean canchaDisponible(Cancha cancha) {
		return cancha.getReservada();
	}

	public boolean asignarResultado(String resultado, Partido partido) {
		partido.setResultado(resultado);
	}
}