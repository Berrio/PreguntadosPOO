public class play {
    public play(){

    }

    public void jugar2(){
        Jugar jugar = new Jugar();
        jugar.inicializar();
        Jugador jugador=new Jugador();
        Podium podium=new Podium();


        if (!jugador.setNombre()){
            System.out.println("sin nombre no puedes continuar");
            return;
        }

        int cont=1;
        int contAciertos=0;
        boolean contestoBien=true;
        while(cont<=jugar.getJuego().getPreguntasYRespuestas().size()&&contestoBien){
            int idPregunta=jugar.ArrojarPregunta();
            if(jugar.contestarPregunta(idPregunta)){
                System.out.println("respondiste bien");
                contAciertos++;
                contestoBien=true;
            }
            else
            {
                System.out.println("Respondiste mal");
                contestoBien=false;
            }
            cont++;
        }

        System.out.println("Fin del Juego");
        jugador.getNombre();
        jugador.setPuntaje(contAciertos*100);
        System.out.println("Tu puntaje es: "+jugador.getPuntaje());
        podium.setJugadorEnPodium(jugador);


        System.out.println(podium.getJugadorEnPodium().get(0).getNombre());
    }

}
