package Prueba2.Patos;



public class PatoDeHule extends Pato {

    public PatoDeHule() {
        super();

        Dibujar();
        establecerGraznido("Chillido");
        establecerVuelo("sinVuelo");
        Graznar("Chillido");
        Volar("sinVuelo");
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato De Hule");
    }
    
}