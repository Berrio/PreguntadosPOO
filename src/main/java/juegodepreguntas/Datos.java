package juegodepreguntas;

import java.io.IOException;

/**
 * Intefaz Datos: Se debe implemetar si se quieren leer los datos del archivo preguntas.json
 */
public interface Datos {
    void leerPreguntas() throws IOException;
}
