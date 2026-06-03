package Prueba1;

public class PatoDeHule extends Pato {

    public PatoDeHule() {
        super();
        comportamientoDeGraznido tipoGraznido = new Chillido();
        comportamientoDeVuelo tipoVuelo = new sinVuelo();

        Dibujar();
        Graznar(tipoGraznido);
        Volar(tipoVuelo);
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato De Hule");
    }
    
}