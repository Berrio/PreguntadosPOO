package juegodepreguntas;

public class Jugador {
  protected String nombreUsuario;
  protected Integer puntaje;

  public Jugador(String nombre, Integer puntaje) {
    this.nombreUsuario = nombre;
    this.puntaje = puntaje;
  }

  public String obtenerNombre() {
    return this.nombreUsuario;
  }

  public int obtenerPuntaje() {
    return this.puntaje;
  }

  public void cambiarPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }
}

