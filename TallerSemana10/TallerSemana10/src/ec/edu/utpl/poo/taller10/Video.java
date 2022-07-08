package ec.edu.utpl.poo.taller10;

public class Video extends Multimedia {
    private double duracion;
    private String titulo;
    private boolean estaTranscrtito;

    public Video(String ruta,Licencia licencia,double tamanio, String extension,double duracion, String titulo, boolean estaTranscrtito) {
        super(ruta,licencia,tamanio,extension);
        this.setDuracion(duracion);
        this.setTitulo(titulo);
        this.setEstaTranscrtito(estaTranscrtito);

    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstaTranscrtito() {
        return estaTranscrtito;
    }

    public void setEstaTranscrtito(boolean estaTranscrtito) {
        this.estaTranscrtito = estaTranscrtito;
    }


}
