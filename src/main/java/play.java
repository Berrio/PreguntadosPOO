public class play {
    int contAciertos;
    Jugar jugar ;

    public play(){
        contAciertos=0;
        jugar = new Jugar();
    }

    public int getContAciertos() {
        return contAciertos;
    }

    public void inicializarJuego(){

        jugar.inicializarPreguntas();
        System.out.println("Cantidad Preguntas: "+jugar.getJuego().getPreguntasYRespuestas().size());
        int cont=1;
        boolean contestoBien=true;
        while(cont<=jugar.getJuego().getPreguntasYRespuestas().size()&&contestoBien){
            int idPregunta=jugar.ArrojarPregunta();
            if(jugar.contestarPregunta(idPregunta)){
                System.out.println("respondiste bien");
                contAciertos++;
                System.out.println("Tu puntaje hasta el momento es : "+contAciertos*100);
                contestoBien=true;
            }
            else
            {
                System.out.println("Respondiste mal");
                contestoBien=false;
            }
            System.out.println("Cantidad Preguntas:: "+jugar.getJuego().getPreguntasYRespuestas().size());
            System.out.println("");
            cont++;
        }

        System.out.println("Fin del Juego");
        System.out.println("");


    }
    public void crearpreguntaPersonalizada(String pregunta,String categoria,int dificultad){
        jugar.crearpreguntapers( pregunta, categoria, dificultad);
    }


}
