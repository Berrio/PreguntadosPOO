import java.util.Scanner;

public class Jugador {

    private String Nombre;
    private  int puntaje;

    public String getNombre() {
        return Nombre;
    }

    public boolean setNombre() {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu nombre de Usuario");
        String nombre=leer.nextLine();
        Nombre = nombre;
        if (nombre.isEmpty()){
            return false;
        }
        return true;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
