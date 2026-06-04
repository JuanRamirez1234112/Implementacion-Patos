package Prueba2.Patos;


public class PatoMandarin extends Pato {

    public PatoMandarin() {
        super();

        Dibujar();
        establecerGraznido("Quack");
        establecerVuelo("vueloConAlas");
        Graznar();
        Volar();
        Nadar();
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato Mandarin");
    }
}