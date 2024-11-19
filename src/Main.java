import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int fechaDeLanzamiento = 1999;
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
            System.out.println("Pelicula Popular");
        }else {
            System.out.println("Pelicula Retro");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a la pelicula: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: "+mediaEvaluacionUsuario /3);


    }
}

