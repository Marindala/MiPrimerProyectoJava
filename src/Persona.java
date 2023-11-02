public class Persona {
   private String nombre;
   private String apellido;
   private   int edad;



public Persona(){

}
public Persona (String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;

    }

    public void caminar(){
        System.out.println("Caminando");
    }

    public String saltar(){
        return "Saltando";
    }

    //getter and setter los generé desde el generate


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
