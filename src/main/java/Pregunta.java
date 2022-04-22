import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Pregunta {

    protected String pregunta;
    protected String categoria;
    protected String opcion1;
    protected String opcion2;
    protected String opcion3;
    protected String opcion4;
    protected String opcionCorrecta;

    protected List<Pregunta> listPreguntas = new ArrayList<>();

    public Pregunta() throws IOException {
        leerPreguntas();
    }

    public Pregunta(String pregunta, String categoria, String opcion1, String opcion2, String opcion3,
                    String opcion4, String opcionCorrecta) {
        this.pregunta = pregunta;
        this.categoria = categoria;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.opcionCorrecta = opcionCorrecta;
    }

    //Leer preguntas desde el Json
    public void leerPreguntas() throws IOException {

        JSONParser jsonParser = new JSONParser();
        final String dir = System.getProperty("user.dir");
        try (FileReader reader = new FileReader(dir + "\\PreguntadosPOO\\src\\main\\java\\preguntas.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray preguntasList = (JSONArray) obj;

            //Iterate over song array
            preguntasList.forEach(emp -> parsePreguntas((JSONObject) emp));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

    //Agrega las preguntas del Json a un Array
    public void parsePreguntas(JSONObject preguntas) {
        JSONObject preguntaObject = (JSONObject) preguntas.get("pregunta");

        this.pregunta = (String) preguntaObject.get("pregunta");
        this.categoria = (String) preguntaObject.get("categoria");
        this.opcion1 = (String) preguntaObject.get("opcion1");
        this.opcion2 = (String) preguntaObject.get("opcion2");
        this.opcion3 = (String) preguntaObject.get("opcion3");
        this.opcion4 = (String) preguntaObject.get("opcionCorrecta");
        this.opcionCorrecta = (String) preguntaObject.get("opcionCorrecta");

        listPreguntas.add(new Pregunta(pregunta,categoria,opcion1,opcion2,opcion3,opcion4,opcionCorrecta));
    }
}
