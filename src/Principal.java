import modelos.Pelicula;
import modelos.Serie;

import java.util.Scanner;

public class Principal {

    public void muestraElMenu(){

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido a ScreenMatch
                    1) Registrar Nueva Pelicula
                    2) Registrar Nueva Serie
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamieto del Pelicula");
                    int fechaLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la Duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaLanzamiento);
                    peliculaUsuario.setTimepoDuracionMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraPelicula();
                    break;
                    case 2:
                        System.out.println("Ingrese el nombre del Serie");
                        String nombreSerie = teclado.nextLine();
                        System.out.println("Ingrese el año de lanzamiento del Serie");
                        int fechaLanzamientoSerie = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese El numero de temporadas de la Serie");
                        int temporadasSerie = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese los Episodios por temporada de la serie");
                        int episodiosTemporadas = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese la Duracion en minutos de cada episodio");
                        int duracionPorMinutos = teclado.nextInt();
                        Serie serieUsuario = new Serie();
                        serieUsuario.setNombre(nombreSerie);
                        serieUsuario.setFechaDeLanzamiento(fechaLanzamientoSerie);
                        serieUsuario.setTemporadas(temporadasSerie);
                        serieUsuario.setEpisodiosPorTemporada(episodiosTemporadas);
                        serieUsuario.setDuracionEnMinutosPorEpisodio(duracionPorMinutos);
                        serieUsuario.muestraPelicula();

                case 9:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }
}
