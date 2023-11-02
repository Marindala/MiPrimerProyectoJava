public class Main {
    public static void main(String[] args) {
     //vacio
     Automovil auto1 = new Automovil();
     //lleno //en Java siempre punto y coma
     Automovil auto2 = new Automovil("Renault", "Clio", 2020);
        System.out.println("Auto 1, marca:" + auto1.marca);
        System.out.println("Auto 2, marca:" + auto2.marca);
    }
}