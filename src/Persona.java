public class Persona {
    String nombre;
    String apellido;
     int edad;



public Persona(){

}
public Persona (String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;

    }

    void caminar(){
        System.out.println("Caminando");
    }

    String saltar(){
        return "Saltando";
    }


}
