public class Encapsulamiento {
    public static void main(String[] args) {
        System.out.println("\n ----- ENCAPSULAMIENTO ----- \n");

        Personas persona1 = new Personas("Maria", "Perez", 21);

        persona1.setNombre("Vicky");
        persona1.setApellido("Perea");
        System.out.println(persona1.getNombreCompleto() + " y tiene "
                + persona1.getEdad()
                + " años de edad.");

        System.out.println(" ");

        System.out.println(persona1.getNombre() + " " + persona1.getApellido());

    }
}