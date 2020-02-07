package intropoo;

public class EjecutaPersona {

    public static void main(String[] args) {

        Persona persona = new Persona("Maculino", "Saraguro", 45, "Jorge Quizhpe");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("Genero: "+persona.getGenero());
        System.out.println("Cultura: "+persona.getCultura());

        Persona persona1 = new Persona("Femenino", "Valdivia", 35);

        Persona persona2 = new Persona("Masculino", "Olmeca", 20);
        System.out.println("Edad persona 2: "+persona1.getEdad());
        System.out.println("Edad persona 3: "+persona2.getEdad());
        System.out.println("Nombre: "+persona1.getNombre());

    }
}
