public class ClaseAtributosMetodos {

    public static void main(String[] args) {
        System.out.println("\n ----- CLASES - ATRIBUTOS - METODOS ----- \n");

        Carrera c1 = new Carrera();

        c1.nombre = "Tecnicatura en Programacion";
        c1.duracion = 2;
        c1.estaCursando = true;

        Persona p1 = new Persona();

        p1.nombre = "Juan";
        p1.apellido = "Luna";
        p1.edad = 33;
        p1.esEstudiante = true;
        p1.tecnologias = new String[] { "Java", "TypeScript" };

        p1.carrera = c1;

        System.out
                .println(p1.nombre + " " + p1.apellido + ", edad " + p1.edad + " y es estudiante? " + p1.esEstudiante
                        + ". Habilidades tecnologicas: " + p1.tecnologias[0] + " y " + p1.tecnologias[1] + ".");

        System.out.println(" ");

        Carrera c2 = new Carrera();

        c2.nombre = "Tecnicatura en Bioimagenes";
        c2.duracion = 3;
        c2.estaCursando = true;

        Persona p2 = new Persona();
        p2.nombre = "Maria";
        p2.apellido = "De los angeles";
        p2.edad = 22;
        p2.esEstudiante = true;

        p2.carrera = c2;

        System.out
                .println(p2.getNombreCompleto() + ", edad " + p2.edad + " y es estudiante? " + p2.esEstudiante
                        + ". Carrera actual: " + p2.carrera.nombre);

        System.out.println(" ");

        System.out.println(p1.setSaludar("Juan Luna"));

        String luke = "Luke Skywalker";

        System.out.println(p2.setSaludar(luke));

    }
}