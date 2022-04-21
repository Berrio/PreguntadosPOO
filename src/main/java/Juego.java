import java.util.ArrayList;

public class Juego {
    private int puntaje;        //pendiente
    private String Jugador;     //pendiente
    private String categoria;   //pendiente
    private ArrayList<Pregunta> preguntasYRespuestas;


    public void CrearpreguntaYRespuesta(){
        preguntasYRespuestas=new ArrayList<>();
        Pregunta pregunta =new Pregunta();
        pregunta.setPregunta(1,"Cuanto mide la Torre Eiffel","Cultura General",1);
        pregunta.agregarRespuestas(1,"A","150m",false);
        pregunta.agregarRespuestas(1,"B","200m",false);
        pregunta.agregarRespuestas(1,"C","300m",false);
        pregunta.agregarRespuestas(1,"D","400m",true);

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
