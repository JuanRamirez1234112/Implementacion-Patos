package Prueba2.Patos;

import java.util.HashMap;
import java.util.Map;

import Prueba2.Comportamientos.comportamientoDeGraznido;
import Prueba2.Comportamientos.comportamientoDeVuelo;
import Prueba2.Comportamientos.Chillido;
import Prueba2.Comportamientos.Mudo;
import Prueba2.Comportamientos.Quack;
import Prueba2.Comportamientos.sinVuelo;
import Prueba2.Comportamientos.vueloConAlas;



public abstract class Pato {

    Map<String, comportamientoDeGraznido> comportamientosGraznido = new HashMap<>();
    Map<String, comportamientoDeVuelo> comportamientosVuelo = new HashMap<>();    
   
    protected comportamientoDeGraznido tipoGraznido; 
    protected comportamientoDeVuelo tipoVuelo;


    
    public Pato() {

        comportamientosGraznido.put("Chillido", new Chillido());
        comportamientosGraznido.put("Mudo", new Mudo());
        comportamientosGraznido.put("Quack", new Quack());


        comportamientosVuelo.put("sinVuelo", new sinVuelo());
        comportamientosVuelo.put("vueloConAlas", new vueloConAlas());

    }

    protected void establecerGraznido(String tipoGraznido) { 

        this.tipoGraznido = comportamientosGraznido.get(tipoGraznido);
        
        
    }

    protected void establecerVuelo(String tipoVuelo) {  

        this.tipoVuelo = comportamientosVuelo.get(tipoVuelo);
        
    }

    public void Graznar(String tipoGraznido) {
        this.tipoGraznido.graznar();
    }

    public void Volar(String tipoVuelo) {
        this.tipoVuelo.volar();
    }

    public void Nadar() {
        System.out.println("Estoy nadando");
    }

    public void Dibujar() {
        
    }

    

}

    
