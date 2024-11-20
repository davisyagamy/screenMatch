import modelos.Pelicula;
import modelos.Serie;

public class Main {
    public static void main(String[] args) {
        System.out.println("***PELÍCULAS Y SERIES***");
        Principal principal = new Principal();
        principal.muestraElMenu();

        /*Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setFechaDeLanzamiento(1999);
        matrix.setTimepoDuracionMinutos(120);
        matrix.muestraPelicula();

        Pelicula encanto = new Pelicula();
        encanto.setNombre("Encanto");
        encanto.setTimepoDuracionMinutos(120);
        encanto.setFechaDeLanzamiento(2022);
        encanto.muestraPelicula();

        Serie friends = new Serie();
        friends.setNombre("Friends");
        friends.setFechaDeLanzamiento(2022);
        friends.setTemporadas(10);
        friends.setEpisodiosPorTemporada(22);
        friends.setDuracionEnMinutosPorEpisodio(40);
        friends.muestraPelicula();*/

        /*int fechaDeLanzamiento = 1999;
        double evaluacion = 4.9;
        boolean incluidoEnPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio con una excelente calificación.
                """;
        double mediaEvaluacion = (4.5 + 4.8 + 4.9) / 3;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Nombre de la Película: " + nombre);
        System.out.println("Fecha de Lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evaluación: "+evaluacion);
        System.out.println("Esta en el plan Basico: "+incluidoEnPlanBasico);
        System.out.println("Evaluación Media de: "+ mediaEvaluacion);
        System.out.println("Sinopsis: "+sinopsis);

        if (fechaDeLanzamiento > 2023){
            System.out.println("modelos.Pelicula Popular");
        }else {
            System.out.println("modelos.Pelicula Retro");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a la pelicula: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: "+mediaEvaluacionUsuario /3);
*/
    }
}

