package ec.edu.utpl.poo.taller10;

public class Dimension {
private  int ancho;
private int alto;

    public Dimension(int ancho, int alto) {
        this.setAncho(ancho);
        this.setAlto(alto);
    }


    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
