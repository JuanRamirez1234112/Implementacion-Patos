package Prueba2.Patos;

public class PatoVenderaDeRosas extends Pato {

    public PatoVenderaDeRosas() {

        Dibujar();
        establecerGraznido("Canto");
        establecerVuelo("vueloConPoderes");
        Graznar();
        Volar();
        Nadar();
    }

     @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato Vendera De Rosas");
    }
    
}
