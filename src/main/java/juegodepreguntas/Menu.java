package juegodepreguntas;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

  String salir = "";
  Jugar play = new Jugar();
  Scanner leer = new Scanner(System.in);

  public Menu() throws IOException {
  }


  public void imprimirMenu() {
    while (salir.isEmpty()) {
      System.out.println("");
      System.out.println("Bienvenido a Preguntas y Respuestas");
      System.out.println("Menu de Opciones:");
      String[][] menu = {{"A", "Jugar"}, {"B", "Ver Puntajes"}};


      for (int i = 0; i < menu.length; i++) {
        System.out.println(menu[i][0] + " " + menu[i][1]);
      }

      System.out.println("Ingrese una Opcion");
      String respuesta = leer.nextLine().toUpperCase();


      if (respuesta.matches("A")) {
        play.inicializarPreguntas();


      }
      if (respuesta.matches("B")) {
        play.getPodium().obtenerJugadorEnPodium();

      }

      System.out.println("Si desea continuar pulse ENTER de lo contrario escriba x");
      Scanner leerSalir = new Scanner(System.in);
      salir = leerSalir.nextLine().toUpperCase();


    }
    System.out.println("Nos Vemos!");

  }


}
