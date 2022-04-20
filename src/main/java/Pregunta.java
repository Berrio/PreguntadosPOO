import java.util.ArrayList;
import java.util.LinkedList;

public class Pregunta {

    private int id;
    private String pregunta;
    private ArrayList<Respuesta>ArrayRespuestas;
    private String categoria;
    private int dificultad;

    public Pregunta(){
        ArrayRespuestas= new ArrayList<>();
    }
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setPregunta(int id, String pregunta, String categoria, int dificultad) {
        this.pregunta = pregunta;
        this.id = id;
        this.categoria=categoria;
        this.dificultad=dificultad;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDificultad() {
        return dificultad;
    }


    public void agregarRespuestas(int id,String posicion, String res, boolean escorrecta){
            Respuesta respuesta=new Respuesta();
            respuesta.setRespuesta(this.id,posicion,res,escorrecta);
            ArrayRespuestas.add(respuesta);
    }

    public ArrayList<Respuesta> getArrayRespuestas() {
        return ArrayRespuestas;
    }
}
