//Gracias a la Herencia evito copiar tanto codigo
//con las mismas propiedades que Automovil utilizo extends hereda de Automovil
//cuando coloco extends que viene de Herencia retiro todo lo que se repite de codigo
public class AutoDeportivo extends Automovil{


    //pero puede tener sus propias propiedades
    private boolean esConvertible;
  //generate none para un constructor vacio
    public AutoDeportivo() {
    }
  //generate con todas las propiedades para un constructor completo
    public AutoDeportivo(String marca, String modelo, int anioFabricacion, boolean esConvertible) {
        //utilizo el super en herencia
        super(marca, modelo, anioFabricacion);
        this.esConvertible = esConvertible;
    }
   //generate getters y setters para todas las propiedades


    public boolean isEsConvertible() {
        return esConvertible;
    }

    public void setEsConvertible(boolean esConvertible) {
        this.esConvertible = esConvertible;
    }
}
