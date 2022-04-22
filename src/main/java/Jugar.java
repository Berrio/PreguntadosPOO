import java.io.IOException;
import java.util.*;

public class Jugar {

    protected Integer contAciertos;
    protected Integer dificultad;
    Random rand = new Random();
    Pregunta app = new Pregunta();
    Podium podium = new Podium();
    String correcta = "";
    String a = "";
    String b = "";
    String c = "";
    String d = "";
    Scanner leer = new Scanner(System.in);
    List<String> listaRespuestas = new ArrayList<>();

    public Jugar() throws IOException {
        this.contAciertos = 0;
        this.dificultad = 1;
    }

    public void inicializarPreguntas() {
        Boolean contestoBien = true;
        System.out.println("Ingresa tu nombre de Usuario");
        String nombre = leer.nextLine();
        if (nombre.isEmpty()){
            nombre = "Anonimo";
        }
        Jugador jugador = new Jugador(nombre,0);
        while (this.dificultad <=5 && contestoBien) {
            ArrojarPregunta();
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
            System.out.println("");
            System.out.println("Respondiste mal");
            System.out.println("");
            jugador.cambiarPuntaje(0);
            podium.agregarJugadorEnPodium(jugador);
            contestoBien = false;
            this.dificultad=1;
            break;
        }
        System.out.println("¡¡¡¡FIN!!!!");
        System.out.println("");
        podium.agregarJugadorEnPodium(jugador);
        System.out.println("");
    }

    public void ArrojarPregunta() {
        Integer randomNum = 0;
        List<Pregunta> lista =  app.listPreguntas;
        switch (this.dificultad){
            case 1:
                randomNum = rand.nextInt(5);
                break;
            case 2:
                randomNum = 5 + rand.nextInt((10-5));
                break;
            case 3:
                randomNum = 10 + rand.nextInt((15-10));
                break;
            case 4:
                randomNum = 15 + rand.nextInt((20-15));
                break;
            case 5:
                randomNum = 20 + rand.nextInt((25-20));
                break;
        }

        System.out.println("Pregunta: " + lista.get(randomNum).pregunta);
        System.out.println("Categoria: " + lista.get(randomNum).categoria);
        a = String.valueOf(lista.get(randomNum).opcion1);
        b = String.valueOf(lista.get(randomNum).opcion2);
        c = String.valueOf(lista.get(randomNum).opcion3);
        d = String.valueOf(lista.get(randomNum).opcion4);
        opciones();
        correcta = String.valueOf(lista.get(randomNum).opcionCorrecta);
        System.out.println("");
    }

    public void opciones(){
        Integer i=0;
        char opcion = 'a';
        String seleccion;
        List<Integer> aleatorio = new ArrayList<>();
        Integer numeroRandom;
        while (i<4){
            numeroRandom = rand.nextInt(4);
            if(!(aleatorio.contains(numeroRandom))){
                seleccion = seleccionadas(numeroRandom);
                System.out.println(opcion + ")" + seleccion);
                listaRespuestas.add(seleccion);
                aleatorio.add(numeroRandom);
                opcion++;
                i++;
            }
        }
    }

    public String seleccionadas(Integer numeroRandom){
        switch (numeroRandom){
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
        }
        return "";
    }


    public Boolean contestarPregunta() {
        Boolean acierto = false;
        System.out.println("Ingrese una Opcion");
        Scanner leer = new Scanner(System.in);
        String respuesta = leer.nextLine().toUpperCase();
        String laRespuesta = "";
        switch (respuesta) {
            case "A": {
                laRespuesta = listaRespuestas.get(0);
                break;
            }
            case "B": {
                laRespuesta = listaRespuestas.get(1);
                break;
            }
            case "C": {
                laRespuesta = listaRespuestas.get(2);
                break;
            }
            case "D": {
                laRespuesta = listaRespuestas.get(3);
                break;
            }
        }

        if (Objects.equals(laRespuesta, correcta)){
            listaRespuestas.clear();
            return true;
        }
        return acierto;
    }
}
