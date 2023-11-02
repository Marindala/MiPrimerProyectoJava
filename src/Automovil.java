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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //getters y setters
    public String getMarca(){
        return this.marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    void setMarca(String marca){
        this.marca = marca;
    }
}
