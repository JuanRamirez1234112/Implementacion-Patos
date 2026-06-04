package Prueba2.Patos;



public class PatoDeCaza extends Pato {

    public PatoDeCaza() {
        super();
        

        Dibujar();
        establecerGraznido("Mudo");
        establecerVuelo("sinVuelo");
        Graznar();
        Volar();
        Nadar();
    
    }

    @Override
    public void Dibujar() {
        System.out.println("-------------------");
        System.out.println("Pato de Caza");
    }
    
}
