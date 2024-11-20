package modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnPlanBasico;
    private String sinopsis;
    private int timepoDuracionMinutos;

    public void muestraPelicula() {
        System.out.println("*** ------ ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("Incluido en plan basico: " + incluidoEnPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Timepo Duracion: " + getTimepoDuracionMinutos() + " minutos");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }

    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTimepoDuracionMinutos() {
        return timepoDuracionMinutos;
    }

    public void setTimepoDuracionMinutos(int timepoDuracionMinutos) {
        this.timepoDuracionMinutos = timepoDuracionMinutos;
    }
}
