import java.util.ArrayList;

public class Juego {
    private int puntaje;
    private String Jugador;
    private String categoria;
    private ArrayList<Pregunta> preguntasYRespuestas;


    public void CrearpreguntaYRespuesta(){
        preguntasYRespuestas=new ArrayList<>();
        Pregunta pregunta =new Pregunta();
        pregunta.setPregunta(1,"quien es aquel","inventos",1);
        pregunta.agregarRespuestas(1,"A","nadie1",false);
        pregunta.agregarRespuestas(1,"B","nadie2",false);
        pregunta.agregarRespuestas(1,"C","nadie3",false);
        pregunta.agregarRespuestas(1,"D","yo",true);

        preguntasYRespuestas.add(pregunta);

        Pregunta pregunta2 =new Pregunta();
        pregunta2.setPregunta(1,"cuanto dura","inventos",1);
        pregunta2.agregarRespuestas(1,"A","uno",false);
        pregunta2.agregarRespuestas(1,"B","dos",false);
        pregunta2.agregarRespuestas(1,"C","tres",false);
        pregunta2.agregarRespuestas(1,"D","este es",true);

        preguntasYRespuestas.add(pregunta2);
    }

    public ArrayList<Pregunta> getPreguntasYRespuestas() {
        return preguntasYRespuestas;
    }

}
