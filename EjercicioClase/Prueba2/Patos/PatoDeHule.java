package Prueba2.Patos;



public class PatoDeHule extends Pato {

    public PatoDeHule() {
        super();

        Dibujar();
        establecerGraznido("Chillido");
        establecerVuelo("sinVuelo");
        Graznar();
        Volar();
        Nadar();
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato De Hule");
    }
    
}