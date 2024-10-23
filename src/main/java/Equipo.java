import java.util.ArrayList;

public class Equipo {
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private Entrenador entrenador;
	private Deporte deporte;

	public Equipo(ArrayList<Deportista> deportistas, Entrenador entrenador, Deporte deporte){
		this.deportistas = deportistas;
		this.entrenador = entrenador;
		this.deporte = deporte;
	}

	public Deporte obtenerDeporte() {
		return this.deporte;
	}

	public ArrayList<Deportista> obtenerDeportistas() {
		return this.deportistas;
	}

	public Entrenador obtenerEntrenador() {
		return this.entrenador;
	}

	public boolean agregarDeportista(Deportista deportista) {
		for (Deportista deportistaEnLista : this.deportistas){
			if (deportistaEnLista != null) {
				if (deportistaEnLista == deportista) {
					return false;
				}
			}
		}
		deportistas.add(deportista);
		return true;
	}

	public boolean agregarEntrenador(Entrenador entrenador) {
		if (this.entrenador == entrenador){
			return false;
		}
		this.entrenador = entrenador;
		return true;
	}

	public boolean establecerDeporte(Deporte deporte) {
		if (this.deporte == deporte){
			return false;
		}
		this.deporte = deporte;
		return true;
	}
}