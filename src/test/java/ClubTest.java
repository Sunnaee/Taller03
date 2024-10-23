import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    Deporte deporte = new Deporte("deporte1");
    Deportista deportista1 = new Deportista("nombre1","apellido1","contacto1",deporte);
    Deportista deportista2 = new Deportista("nombre2","apellido2","contacto2",deporte);
    Entrenador entrenador = new Entrenador("nombreEntrenador","experiencia",deporte);
    Entrenador entrenador2 = new Entrenador("nombreEntrenador2","experiencia2",deporte);
    ArrayList<Deportista> deportistas = new ArrayList<>(Arrays.asList());
    Equipo equipo1 = new Equipo(deportistas,entrenador,deporte);
    Equipo equipo2 = new Equipo(deportistas,entrenador2,deporte);
    Date fecha1 = new Date(124, Calendar.OCTOBER,1);
    Date fecha2 = new Date(125, Calendar.OCTOBER,1);
    ArrayList<Partido> partidos = new ArrayList<>(Arrays.asList());
    Cancha cancha = new Cancha("cancha1","superficie1","ubicacion1",100,fecha2,partidos);
    Partido partido = new Partido("",fecha1,cancha,equipo1,equipo2);
    ArrayList<Equipo> equipos = new ArrayList<>(Arrays.asList());
    Club club = new Club(equipos,partidos);

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        deportistas = new ArrayList<>(Arrays.asList());
        equipo1 = new Equipo(deportistas,entrenador,deporte);
        equipo2 = new Equipo(deportistas,entrenador2,deporte);
        partidos = new ArrayList<>(Arrays.asList());
        cancha = new Cancha("cancha1","superficie1","ubicacion1",100,fecha2,partidos);
        equipos = new ArrayList<>(Arrays.asList());
        club = new Club(equipos,partidos);
    }

    @Test
    void registrarEquipo() {
        assertTrue(club.registrarEquipo(equipo1));
    }

    @Test
    void registrarDeportista() {
        assertTrue(club.registrarDeportista(equipo1,deportista1));
    }

    @Test
    void registrarEntrenador() {
        assertTrue(club.registrarEntrenador(equipo1,entrenador));
    }

    @Test
    void crearPartido() {
        assertFalse(club.crearPartido(equipo1,equipo2,cancha,fecha1));
    }

    @Test
    void canchaDisponible() {
        assertFalse(club.canchaDisponible(fecha2,cancha));
    }

    @Test
    void asignarResultado() {
        assertTrue(club.asignarResultado("resultado1",partido));
    }
}