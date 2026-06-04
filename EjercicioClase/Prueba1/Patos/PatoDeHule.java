package Prueba1.Patos;

import Prueba1.Comportamientos.Chillido;
import Prueba1.Comportamientos.comportamientoDeGraznido;
import Prueba1.Comportamientos.comportamientoDeVuelo;
import Prueba1.Comportamientos.sinVuelo;


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