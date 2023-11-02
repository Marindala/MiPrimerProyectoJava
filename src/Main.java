public class Main {
    public static void main(String[] args) {
     //vacio
     Automovil auto1 = new Automovil();
     //lleno //en Java siempre punto y coma
     Automovil auto2 = new Automovil("Renault", "Clio", 2020);
        System.out.println("Auto 1, año de fabricación:" + auto1.anioFabricacion);
        System.out.println("Auto 2, marca:" + auto2.marca);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Fernando", "Casal", 35);
        System.out.println("Persona 2, nombre:" + persona2.nombre);
    }
}