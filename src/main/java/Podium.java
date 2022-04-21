import java.util.ArrayList;

public class Podium {
    ArrayList<Jugador> jugadors;

    public Podium(){
        jugadors=new ArrayList<>();
    }

    public void setJugadorEnPodium(Jugador jugador){
        jugadors.add(jugador);
    }

    public ArrayList<Jugador> getJugadorEnPodium(){
        return jugadors;
    }
}
