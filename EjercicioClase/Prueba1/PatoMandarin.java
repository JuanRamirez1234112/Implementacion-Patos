package Prueba1;

public class PatoMandarin extends Pato {

    public PatoMandarin() {
        super();
        comportamientoDeGraznido tipoGraznido = new Quack();
        comportamientoDeVuelo tipoVuelo = new vueloConAlas();

        Dibujar();
        Graznar(tipoGraznido);
        Volar(tipoVuelo);
    
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato Mandarin");
    }
}