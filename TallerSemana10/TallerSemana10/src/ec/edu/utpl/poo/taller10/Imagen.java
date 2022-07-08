package ec.edu.utpl.poo.taller10;

public class Imagen extends Multimedia{
 private String textoAlt;
 private Dimension dimension;
 private boolean esTransparente;


    public Imagen(String ruta, Licencia licencia, double tamanio, String extension, String textoAlt, boolean esTransparente) {
        super(ruta, licencia, tamanio, extension);
        this.setTextoAlt(textoAlt);
        this.setEsTransparente(esTransparente);
    }


    public String getTextoAlt() {
        return textoAlt;
    }

    public void setTextoAlt(String textoAlt) {
        this.textoAlt = textoAlt;
    }



    public boolean isEsTransparente() {
        return esTransparente;
    }

    public void setEsTransparente(boolean esTransparente) {
        this.esTransparente = esTransparente;
    }
    public void addDimension(int ancho, int alto) {
        setDimension(new Dimension(ancho,alto));
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
