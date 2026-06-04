package Prueba2.Patos;



public class PatoMallard extends Pato {

    public PatoMallard() {
        super();

        Dibujar();
        establecerVuelo("vueloConAlas");
        establecerGraznido("Quack");
        Graznar();
        Volar();
        Nadar();

    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato Mallard");
    }

    
    
}