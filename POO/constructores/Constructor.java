public class Constructor {

  public static void main(String[] args) {
    System.out.println("\n ----- CONSTRUCTORES y SOBRECARGA ----- \n");

    Persona p1 = new Persona("Juan", "Luna", 34, "Tecnicatura en Programación", true, 3, false);

    System.out
        .println(p1.nombre + " " + p1.apellido + ", edad " + p1.edad + " y es estudiante? "
            + p1.esEstudiante
            + ". " + "Estudiante de la Carrera " + p1.carrera.nombre + "."
            + " Duración de la carrera: " + p1.carrera.duracion + " años.");

    System.out.println(" ");

    Persona p2 = new Persona("Maria", "De los Angeles", 22, true, "Radiología");

    System.out.println(p2.nombre + p2.apellido + " edad " + p2.edad + ". Cursa? " + p2.esEstudiante + ". Carrera "
        + p2.carrera.nombre);

  }
}
