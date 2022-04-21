public class Respuesta {

    private int idPregunta;
    private String posicion;
    private String respuesta;
    private boolean esvalida;

    public String getPosicion() {
        return posicion;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public boolean Esvalida() {
        return esvalida;
    }

    public void setRespuesta(String posicion, String respuesta, boolean esvalida) {
        this.idPregunta= idPregunta;
        this.posicion=posicion;
        this.respuesta= respuesta;
        this.esvalida= esvalida;
    }

}
//Creación de objetos de entidades; ronda, jugador, categoría, premio,pregunta,
//opciones, etc...