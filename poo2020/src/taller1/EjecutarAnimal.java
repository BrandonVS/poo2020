package taller1;

public class EjecutarAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.actualizarFamilia("Caninos");
        animal.actualizarRaza("Bulldog");
        animal.actualizarEspecie("Bulldog ingles");
        animal.actualizarNombreComun("Perro");
        animal.actualizarNombreCientifico("Canis Lupus Familiaris");

        String mostrar_animal = animal.obtenerAnimal();
        System.out.println(mostrar_animal);

        String mostrar_nace = animal.obtenerNacer();
        System.out.println(mostrar_nace);

        String mostrar_crece = animal.obtenerCrecer();
        System.out.println(mostrar_crece);

        String mostrar_reproduce = animal.obtenerReproducir();
        System.out.println(mostrar_reproduce);

        String mostrar_muere = animal.obtenerMorir();
        System.out.println(mostrar_muere);
    }
}
