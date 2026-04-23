public class Constructor {

  public static void main(String[] args) {
    System.out.println("\n ----- CONSTRUCTORES ----- \n");

    Persona p1 = new Persona("Juan", "Luna", 34, "Tecnicatura en Programación", true, 3, false);

    System.out
        .println(p1.nombre + " " + p1.apellido + ", edad " + p1.edad + " y es estudiante? "
            + p1.esEstudiante
            + ". " + "Estudiante de la Carrera " + p1.carrera.nombre + "."
            + " Duración de la carrera: " + p1.carrera.duracion + " años.");

    System.out.println(" ");

  }
}
