package Prueba2.Patos;



public class PatoMallard extends Pato {

    public PatoMallard() {
        super();

        Dibujar();
        establecerVuelo("vueloConAlas");
        establecerGraznido("Quack");
        Graznar("Quack");
        Volar("vueloConAlas");

    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato Mallard");
    }

    
    
}