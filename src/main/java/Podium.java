import java.util.ArrayList;

public class Podium {
    ArrayList<Jugador> jugadores;

    public Podium(){
        jugadores=new ArrayList<>();
    }

    public void setJugadorEnPodium(Jugador jugador){
        jugadores.add(jugador);
    }

    public void getJugadorEnPodium(){

        if (jugadores.size()==0){
            System.out.println("Aun no han jugado");
        }else
        {
            for (int i=0;i<jugadores.size();i++){
                System.out.println("Nombre: "+jugadores.get(i).getNombre()+" Puntaje: "+jugadores.get(i).getPuntaje());
            }
        }

    }
}
