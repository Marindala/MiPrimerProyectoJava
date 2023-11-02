public class Automovil {
    String marca;
    String modelo;
    int anioFabricacion;

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
}
