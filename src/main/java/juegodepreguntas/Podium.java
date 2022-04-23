package juegodepreguntas;

import java.util.ArrayList;

public class Podium {
  ArrayList<Jugador> jugadores = new ArrayList<>();

  public void agregarJugadorEnPodium(Jugador jugador) {
    jugadores.add(jugador);
  }

  public void obtenerJugadorEnPodium() {

    if (jugadores.size() == 0) {
      System.out.println("Aun no han jugado");
    } else {
      for (int i = 0; i < jugadores.size(); i++) {
        System.out.println("Nombre: " + jugadores.get(i).obtenerNombre() + " Puntaje: " + jugadores.get(i).obtenerPuntaje());
      }
    }

  }
}
