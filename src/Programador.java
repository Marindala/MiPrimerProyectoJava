public class Programador extends Persona {

    private boolean disponibleLaboral;

    public Programador() {
    }



    public Programador(String nombre, String apellido, int edad, boolean disponibleLaboral) {
        super(nombre, apellido, edad);
        this.disponibleLaboral = disponibleLaboral;
    }


}
