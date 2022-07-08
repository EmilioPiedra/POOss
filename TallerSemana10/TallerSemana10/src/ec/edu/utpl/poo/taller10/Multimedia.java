package ec.edu.utpl.poo.taller10;

public class Multimedia {
    private String ruta;
    private Licencia licencia;
    private double tamanio;
    private String extension;

    public Multimedia(String ruta, Licencia licencia, double tamanio, String extension) {
        this.setRuta(ruta);
        this.setLicencia(licencia);
        this.setTamanio(tamanio);
        this.setExtension(extension);
    }


    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
