package ec.edu.utpl.poo.taller10;

import java.util.ArrayList;
import java.util.List;

public class Mensaje {

    private String texto;
    private List<Multimedia> multimedias = new ArrayList<>();

    public Mensaje(String texto) {
        this.setTexto(texto);
    }

    public void addMultimedia(Multimedia multimedia) {
        getMultimedias().add(multimedia);
    }

    public double calcularTamanioTotal() {
        double tamanioTotal = 0;
        for (var multimedia : multimedias) {
            tamanioTotal += multimedia.getTamanio();
        }
        return tamanioTotal;

    }

    public double calcularDuracionTotal() {
        double duracionTotal = 0;
        for (var multimedia : multimedias) {
            if (multimedia instanceof Video) {
                Video aux = (Video) multimedia;
                duracionTotal = duracionTotal + aux.getDuracion();
            }
        }
        return duracionTotal;
    }

    public int obtenerAnchoMayor() {


        int anchoMayor = 0;
        for (var multimedia : multimedias) {
            if (multimedia instanceof Imagen) {
                Imagen aux = (Imagen) multimedia;
                if (aux.getDimension().getAncho() > anchoMayor) {
                    anchoMayor = aux.getDimension().getAncho();
                }
            }
        }
        return anchoMayor;
    }

    public int contarMultimediaCR() {
        int contador = 0;
        for (var multimedia : multimedias) {
            if (multimedia.getLicencia() == Licencia.COPYRIGHT) {
                contador = contador + 1;
            }

        }
        return contador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Multimedia> getMultimedias() {
        return multimedias;
    }

    public void setMultimedias(List<Multimedia> multimedias) {
        this.multimedias = multimedias;
    }
}
