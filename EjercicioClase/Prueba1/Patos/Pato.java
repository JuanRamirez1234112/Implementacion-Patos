package Prueba1.Patos;

import java.util.List;

import Prueba1.Comportamientos.Chillido;
import Prueba1.Comportamientos.Mudo;
import Prueba1.Comportamientos.Quack;
import Prueba1.Comportamientos.comportamientoDeGraznido;
import Prueba1.Comportamientos.comportamientoDeVuelo;
import Prueba1.Comportamientos.sinVuelo;
import Prueba1.Comportamientos.vueloConAlas;


import java.util.ArrayList;

public class Pato {

    private List<comportamientoDeGraznido> ComportamientosDeGraznido = new ArrayList<>();
    private List<comportamientoDeVuelo> ComportamientosDeVuelo = new ArrayList<>();

    public Pato() {

        ComportamientosDeVuelo.add(new sinVuelo());
        ComportamientosDeVuelo.add(new vueloConAlas());

        ComportamientosDeGraznido.add(new Chillido());
        ComportamientosDeGraznido.add(new Mudo());
        ComportamientosDeGraznido.add(new Quack());
    
    }

    public void Graznar(comportamientoDeGraznido tipoGraznido) {
        tipoGraznido.graznar();
    }

    public void Volar(comportamientoDeVuelo tipoVuelo) {
        tipoVuelo.volar();
    }

    public void Nadar() {
        System.out.println("Estoy nadando");
    }

    public void Dibujar() {
        System.out.println("Pato generico");
    }

    

}

    
