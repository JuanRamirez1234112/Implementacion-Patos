package Prueba1;

import java.util.List;
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

    
