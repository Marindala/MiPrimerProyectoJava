
//con las mismas propiedades que Automovil
public class AutoDeportivo {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    //pero puede tener sus propias propiedades
    private boolean esConvertible;
  //generate none para un constructor vacio
    public AutoDeportivo() {
    }
  //generate con todas las propiedades para un constructor completo
    public AutoDeportivo(String marca, String modelo, int anioFabricacion, boolean esConvertible) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.esConvertible = esConvertible;
    }
   //generate getters y setters para todas las propiedades
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEsConvertible() {
        return esConvertible;
    }

    public void setEsConvertible(boolean esConvertible) {
        this.esConvertible = esConvertible;
    }
}
