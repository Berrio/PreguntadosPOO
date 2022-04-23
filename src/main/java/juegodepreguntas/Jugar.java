package juegodepreguntas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Objects;

public class Jugar extends Podium{

    private Integer contAciertos;
    private Integer dificultad;
    private boolean salir = false;
    private String correcta;
    private String a = "";
    private  String b = "";
    private String c = "";
    private String d = "";
    private List<String> listaRespuestas = new ArrayList<>();
    Random rand = new Random();
    Pregunta app = new Pregunta();
    Scanner leer = new Scanner(System.in);

    public Jugar() throws IOException {
        this.contAciertos = 0;
        this.dificultad = 1;
    }

    //Este metodo inicia el juego
    public void inicializarJuego() {
        System.out.println("Ingresa tu nombre de Usuario");
        String nombre = leer.nextLine();
        if (nombre.isEmpty()) {
            nombre = "Anonimo";
        }
        salir = false;
        Jugador jugador = new Jugador(nombre, 0);
        while (this.dificultad <= 5) {
            arrojarPregunta();
            System.out.println("--------------------------");
            System.out.println("Si desea salir ingrese X");
            if (contestarPregunta()) {
                System.out.println("Respondiste bien");
                System.out.println("");
                contAciertos++;
                System.out.println("Tu puntaje hasta el momento es : " + contAciertos * 100);
                System.out.println("");
                jugador.cambiarPuntaje(contAciertos * 100);
                this.dificultad++;
                continue;
            }
            if (salir) {
                jugadores.add(jugador);
                contAciertos=0;
                this.dificultad=1;
                break;
            }
            System.out.println("");
            System.out.println("Respondiste mal");
            System.out.println("");
            jugador.cambiarPuntaje(0);
            jugadores.add(jugador);
            contAciertos=0;
            this.dificultad = 1;
            break;
        }
        if (dificultad==6){
            jugadores.add(jugador);
            contAciertos=0;
            this.dificultad=1;
            System.out.println("¡¡¡GANASTEEEE!!!!");
        }
        System.out.println("¡¡¡¡FIN!!!!");
        System.out.println("");

    }

    //Este metodo entrega las preguntas con sus respectivas respuestas
    public void arrojarPregunta() {
        correcta ="";
        Integer randomNum = 0;
        List<Pregunta> lista = app.listPreguntas;
        switch (this.dificultad) {
            case 1:
                randomNum = rand.nextInt(5);
                break;
            case 2:
                randomNum = 5 + rand.nextInt((10 - 5));
                break;
            case 3:
                randomNum = 10 + rand.nextInt((15 - 10));
                break;
            case 4:
                randomNum = 15 + rand.nextInt((20 - 15));
                break;
            case 5:
                randomNum = 20 + rand.nextInt((25 - 20));
                break;
            default:
                break;
        }

        System.out.println("Pregunta: " + lista.get(randomNum).pregunta);
        System.out.println("Categoria: " + lista.get(randomNum).categoria);
        a = String.valueOf(lista.get(randomNum).opcion1);
        b = String.valueOf(lista.get(randomNum).opcion2);
        c = String.valueOf(lista.get(randomNum).opcion3);
        d = String.valueOf(lista.get(randomNum).opcion4);
        opcionesRespuestas();
        correcta = String.valueOf(lista.get(randomNum).opcionCorrecta);
        System.out.println("");
    }

    //Este metodo es llamado por arrojarPregunta() para entregar las respuestas
    public void opcionesRespuestas() {
        Integer i = 0;
        char opcion = 'a';
        String seleccion;
        List<Integer> aleatorio = new ArrayList<>();
        Integer numeroRandom;
        while (i < 4) {
            numeroRandom = rand.nextInt(4);
            if (!(aleatorio.contains(numeroRandom))) {
                seleccion = seleccionadas(numeroRandom);
                System.out.println(opcion + ")" + seleccion);
                listaRespuestas.add(seleccion);
                aleatorio.add(numeroRandom);
                opcion++;
                i++;
            }
        }
    }

    // Este metodo lo requiere opcionesRespuestas() para generar un orden aleatoria a los respuestas
    public String seleccionadas(Integer numeroRandom) {
        switch (numeroRandom) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
            default:
                return "";
        }
    }

    //Este metodo verifica la respuesta y retorna si hay o no respuesta del usuario
    public Boolean contestarPregunta() {
        Boolean acierto = false;
        String respuesta;
        String laRespuesta = "";
        Boolean controlador = true;

        while (controlador) {
            System.out.println("Ingrese una Opcion");
            respuesta = leer.nextLine().toUpperCase();
            switch (respuesta) {
                case "A": {
                    laRespuesta = listaRespuestas.get(0);
                    controlador = false;
                    break;
                }
                case "B": {
                    laRespuesta = listaRespuestas.get(1);
                    controlador = false;
                    break;
                }
                case "C": {
                    laRespuesta = listaRespuestas.get(2);
                    controlador = false;
                    break;
                }
                case "D": {
                    laRespuesta = listaRespuestas.get(3);
                    controlador = false;
                    break;
                }
                case "X": {
                    salir = true;
                    controlador = false;
                    break;
                }

                default:
                    System.out.println("Ingresaste una opción invalida");

            }
        }
        if (Objects.equals(laRespuesta, correcta)) {
            listaRespuestas.clear();
            return true;
        }
        listaRespuestas.clear();
        return acierto;
    }

    @Override
    public List<Jugador> obtenerJugadores() {
        return jugadores;
    }
}
