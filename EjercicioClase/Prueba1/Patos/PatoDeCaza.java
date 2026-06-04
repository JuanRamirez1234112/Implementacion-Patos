package Prueba1.Patos;

import Prueba1.Comportamientos.Mudo;
import Prueba1.Comportamientos.comportamientoDeGraznido;
import Prueba1.Comportamientos.comportamientoDeVuelo;
import Prueba1.Comportamientos.sinVuelo;

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
