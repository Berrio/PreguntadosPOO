package juegodepreguntas;

public class Jugador {
    protected String nombreUsuario;
    protected Integer puntaje;

    public Jugador(String nombre, Integer puntaje) {
        this.nombreUsuario = nombre;
        this.puntaje = puntaje;
    }

    public void cambiarPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}

