package taller1;

public class EjecutarVehiculo {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizarMarca("Toyota");
        vehiculo.actualizarPlaca("LSR-2945");
        vehiculo.actualizarColor("Rojo");
        vehiculo.actualizarModelo("Toyota Yaris");
        vehiculo.actualizarMatricula("2016");

        String mostrar_vehiculo = vehiculo.obtenerVehiculo();
        System.out.println(mostrar_vehiculo);

        String mostrar_transporta = vehiculo.obtenerTransporte();
        System.out.println(mostrar_transporta);
    }
}
