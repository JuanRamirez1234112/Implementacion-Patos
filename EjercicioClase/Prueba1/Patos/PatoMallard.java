package Prueba1.Patos;

import Prueba1.Comportamientos.Quack;
import Prueba1.Comportamientos.comportamientoDeGraznido;
import Prueba1.Comportamientos.comportamientoDeVuelo;
import Prueba1.Comportamientos.vueloConAlas;

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