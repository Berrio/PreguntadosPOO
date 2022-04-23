package juegodepreguntas;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu extends Podium {

    private String salir = "";
    private final Scanner leer = new Scanner(System.in);
    Jugar play = new Jugar();

    //Constructor sin atributos solo para implementar la IOException que requiere el objeto Jugar debido al Json
    public Menu() throws IOException {
    }

    //Imprime el Menu Inicial del Juego
    public void imprimirMenu() {
        while (salir.isEmpty()) {
            System.out.println("");
            System.out.println("Bienvenido a Preguntas y Respuestas");
            System.out.println("Menu de Opciones:");
            String[][] menu = {{"A", "Jugar"}, {"B", "Ver Puntajes"},{"C", "Salir"}};

            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i][0] + " " + menu[i][1]);
            }

            System.out.println("Ingrese una Opcion");
            String respuesta = leer.nextLine().toUpperCase();

            switch (respuesta){
                case "A":
                    play.inicializarJuego();
                    break;
                case "B":
                    List<Jugador> list;
                    list = obtenerJugadores();
                    if (!(jugadores.isEmpty())) {
                        for (Jugador i : list) {
                            System.out.println("Nombre: " + i.nombreUsuario + " y su puntaje es: " + i.puntaje);
                        }
                    } else {
                        System.out.println("Aun no han jugado");
                    }
                    break;
                case "C":
                    salir = "salir";
                    break;
                default:
                    System.out.println("Ingresas una opcion invalida");
            }

            System.out.println("Si desea continuar pulse ENTER de lo contrario escriba x");
            Scanner leerSalir = new Scanner(System.in);
            salir = leerSalir.nextLine().toUpperCase();
        }
        System.out.println("Nos Vemos!");
    }

    //Metodo sobrecargado de la clase padre Podium que retorna el listado de jugador y su puntaje
    @Override
    public List<Jugador> obtenerJugadores() {
        return jugadores;
    }
}
