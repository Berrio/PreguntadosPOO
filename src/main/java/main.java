public class main {
    public static void main(String[] args) {
        Jugar jugar = new Jugar();
        int idPregunta=jugar.ArrojarPregunta();

        if(jugar.contestarPregunta(idPregunta)){
            System.out.println("respondiste bien");
        }
        else
        {
            System.out.println("Respondiste mal");
        }
//        jugar.contestarPregunta(idPregunta);
//        System.out.println("n"+ "a".matches("a"));
    }


}
