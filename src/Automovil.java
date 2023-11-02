public class Automovil {
    //se rompe con private porque desde main quiero ingresar a estos datos que son privados
    private String marca;
    private String modelo;
    private int anioFabricacion;

    //constructor vacio

    public Automovil(){

    }

    //constructor lleno

    public Automovil(String marca, String modelo, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;

    }



    //metodos //sout imprime en consola
    void acelerar(){
        System.out.println("Acelerando");
    }
    String frenar(){
        return "Frenando";
    }

    //getters y setters
}
