import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private int puntaje;        //pendiente
    private String Jugador;     //pendiente
    private String categoria;   //pendiente
    private ArrayList<Pregunta> preguntasYRespuestas=new ArrayList<>();


    public void CrearpreguntaYRespuesta(){

        Pregunta pregunta =new Pregunta();
        pregunta.setPregunta("Cuanto mide la Torre Eiffel","Cultura General",1);
        pregunta.agregarRespuestas("A","150m",false);
        pregunta.agregarRespuestas("B","200m",false);
        pregunta.agregarRespuestas("C","300m",false);
        pregunta.agregarRespuestas("D","400m",true);

        preguntasYRespuestas.add(pregunta);

        Pregunta pregunta2 =new Pregunta();
        pregunta2.setPregunta("cuanto dura","inventos",1);
        pregunta2.agregarRespuestas("A","uno",false);
        pregunta2.agregarRespuestas("B","este",true);
        pregunta2.agregarRespuestas("C","tres",false);
        pregunta2.agregarRespuestas("D","cuatro",false);

        preguntasYRespuestas.add(pregunta2);


    }

    public void CrearpreguntaYRespuestaPersonalizada(String pregunta,String categoria,int dificultad){

        Pregunta preguntas=new Pregunta();
        preguntas.setPregunta(pregunta,categoria,dificultad);
        for (int i=1;i<=4;i++){
            String vocal="";
            switch (i){
                case 1:vocal="A";break;
                case 2:vocal="B";break;
                case 3:vocal="C";break;
                case 4:vocal="D";break;
            }
            Scanner leer=new Scanner(System.in);
            System.out.println("Escriba la Respuesta");
            String scan=leer.nextLine().toUpperCase();
            System.out.println("Escriba 'V' si la respuesta es correcta de lo contrario escriba 'X'" );
            scan=leer.nextLine().toUpperCase();

            boolean valorRespuesta=false;
            switch (scan){
                case "V":valorRespuesta=true;break;
                case "X":valorRespuesta=false;break;
                default:break;
            }

            preguntas.agregarRespuestas(vocal,scan,valorRespuesta);

        }
        preguntasYRespuestas.add(preguntas);
    }

    public ArrayList<Pregunta> getPreguntasYRespuestas() {
        return preguntasYRespuestas;
    }

}
