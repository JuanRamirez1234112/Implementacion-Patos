package Prueba1;

public class PatoDeCaza extends Pato {

    public PatoDeCaza() {
        super();
        comportamientoDeGraznido tipoGraznido = new Mudo();
        comportamientoDeVuelo tipoVuelo = new sinVuelo();

        Dibujar();
        Graznar(tipoGraznido);
        Volar(tipoVuelo);
    
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato de Caza");
    }
    
}
