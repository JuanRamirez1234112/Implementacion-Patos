package Prueba1;

public class PatoMallard extends Pato {

    public PatoMallard() {
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
        System.out.println("Pato Mallard");
    }

    
    
}