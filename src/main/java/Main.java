import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String salir="";
        Podium podium = new Podium();
        Scanner leer = new Scanner(System.in);
        while (salir.isEmpty())
        {
            System.out.println("");
            System.out.println("Bienvenido a Preguntas y Respuestas");
            System.out.println("Menu de Opciones:");
            String[][] menu = {{"A","Jugar"},{"B","Ver Puntajes"}};

            for (int i=0;i<menu.length;i++){
                System.out.println(menu[i][0]+" "+menu[i][1]);
            }

            System.out.println("Ingrese una Opcion");
            String respuesta = leer.nextLine().toUpperCase();

            if (respuesta.matches("A")){
                Jugar play = new Jugar();
                play.inicializarPreguntas();
            }
            if (respuesta.matches("B")){
                podium.obtenerJugadorEnPodium();
            }
            System.out.println("Si desea continuar pulse ENTER de lo contrario escriba x");
            Scanner leerSalir=new Scanner(System.in);
            salir=leerSalir.nextLine().toUpperCase();

        }
        System.out.println("Nos Vemos!");
    }

}
