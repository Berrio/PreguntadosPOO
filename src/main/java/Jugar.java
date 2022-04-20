import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Jugar {
    private Juego juego;

    public Jugar(){
        juego=new Juego();
    }
    public int ArrojarPregunta(){

        juego.CrearpreguntaYRespuesta();

            int min_val = 0;
            int max_val = juego.getPreguntasYRespuestas().size();
            Random rand = new Random();
            int randomNum = min_val + rand.nextInt((max_val - min_val) );

            System.out.println(juego.getPreguntasYRespuestas().get(randomNum).getPregunta());
            System.out.println(juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(0).getPosicion()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(0).getRespuesta()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(0).Esvalida());
            System.out.println(juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(1).getPosicion()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(1).getRespuesta()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(1).Esvalida());
            System.out.println(juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(2).getPosicion()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(2).getRespuesta()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(2).Esvalida());
            System.out.println(juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(3).getPosicion()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(3).getRespuesta()+" "+juego.getPreguntasYRespuestas().get(randomNum).getArrayRespuestas().get(3).Esvalida());

        return randomNum;
    }

    public boolean contestarPregunta(int idPregunta){
        boolean acerto=false;
        Scanner leer=new Scanner(System.in);
        String respuesta=leer.nextLine().toUpperCase();

        int numeroDeRespuesta=0;
        switch (respuesta){
            case "A":{
                numeroDeRespuesta=0;
                break;
            }
            case "B":{
                numeroDeRespuesta=1;
                break;
            }
            case "C":{
                numeroDeRespuesta=2;
                break;
            }
            case "D":{
                numeroDeRespuesta=3;
                break;
            }

        }

            if (respuesta.matches(juego.getPreguntasYRespuestas().get(idPregunta).getArrayRespuestas().get(numeroDeRespuesta).getPosicion())&&
                    juego.getPreguntasYRespuestas().get(idPregunta).getArrayRespuestas().get(numeroDeRespuesta).Esvalida());
            {
                System.out.println(respuesta.equals(juego.getPreguntasYRespuestas().get(idPregunta).getArrayRespuestas().get(numeroDeRespuesta).getPosicion())+"&&"+
                        juego.getPreguntasYRespuestas().get(idPregunta).getArrayRespuestas().get(numeroDeRespuesta).Esvalida());
                return acerto=false;
            }
    }


}
