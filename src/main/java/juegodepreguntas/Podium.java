package juegodepreguntas;

import java.util.ArrayList;
import java.util.List;

/**
 * Podium: Clase abstracta para almacenar y obtener la lista de jugadores
 */
public abstract class Podium {

    protected static List<Jugador> jugadores = new ArrayList<>();

    public abstract List<Jugador> obtenerJugadores();
}