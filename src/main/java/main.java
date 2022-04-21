import java.lang.reflect.Array;
import java.util.Scanner;

public class main {
//    private Juego juego;


    public main(){

    }
    public static void main(String[] args) {
        String salir="";
        Podium podium=new Podium();
        play play =new play();
        while (salir.isEmpty())
        {
            System.out.println("");
            System.out.println("Bienvenido a Preguntas y Respuestas");
            System.out.println("Menu de Opciones:");
            String[][] menu = {{"A","Jugar"},{"B","Ver Puntajes"},{"C","Agregar Preguntas"}};

            for (int i=0;i<menu.length;i++){
                System.out.println(menu[i][0]+" "+menu[i][1]);
            }

            System.out.println("Ingrese una Opcion");
            Scanner leer=new Scanner(System.in);
            String respuesta=leer.nextLine().toUpperCase();

            if (respuesta.matches("A")){
                Jugador jugador=new Jugador();

                if (!jugador.setNombre()){
                    System.out.println("sin nombre no puedes continuar");
                    return;
                }


                play.inicializarJuego();
                jugador.setPuntaje(play.getContAciertos()*100);

                podium.setJugadorEnPodium(jugador);
            }
            if (respuesta.matches("B")){
                podium.getJugadorEnPodium();
            }
            if (respuesta.matches("C")){
                System.out.println("ingrese el titulo de la pregunta");
                Scanner leerPrePersonalizada=new Scanner(System.in);
                String titulo=leerPrePersonalizada.nextLine().toUpperCase();
                System.out.println("ingrese la categoria de la pregunta");
                String categoria=leerPrePersonalizada.nextLine().toUpperCase();
                System.out.println("ingrese un numero para la dificultad de la pregunta");
                int dificultad=Integer.parseInt(leerPrePersonalizada.nextLine().toUpperCase());
                play.crearpreguntaPersonalizada(titulo,categoria,dificultad);
            }
            System.out.println("Si desea continuar pulse ENTER de lo contrario escriba x");
            Scanner leerSalir=new Scanner(System.in);
            salir=leerSalir.nextLine().toUpperCase();

        }
        System.out.println("Nos Vemos!");
    }

}
