package ec.edu.utpl.poo.taller10;

import java.util.List;

public class RunMensajes {
    public static void main(String[] args) {
        Mensaje mensaje1 = new Mensaje("mensaje1");

        Video video1 = new Video ("user.home",Licencia.COPYRIGHT,259,"mp4",10,
                "Hola mundo",true);

        Video video2=new Video("user.home",Licencia.DOMINIO_PUBLICO,300,"mp4",17,
                "Comunicado",true);



        Imagen imagen1 = new Imagen("user.home",Licencia.COPYRIGHT,45,"png",
                "gráfico 1", true);

        imagen1.addDimension(10,11);

        Imagen imagen2= new Imagen("user.home",Licencia.DOMINIO_PUBLICO,75,"png," ,
                "gráfico 2",true);

        mensaje1.addMultimedia(video1);
        mensaje1.addMultimedia(video2);
        mensaje1.addMultimedia(imagen1);
        mensaje1.addMultimedia(imagen2);



        mensaje1.calcularDuracionTotal();
    }

}
