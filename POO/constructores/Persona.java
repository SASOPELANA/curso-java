public class Persona {

  // Atributos o campos de la clase
  String nombre;
  String apellido;
  int edad;
  boolean esEstudiante;
  Carrera carrera;

  // Constructor
  // Constructor por defecto de Persona.
  // Inicializa el atributo 'carrera' con una instancia vacía de Carrera
  // para evitar valores nulos (NullPointerException).
  public Persona(String nombre, String apellido, int edad, String carreraNombre, boolean esEstudiante,
      int duracionCarrera, boolean estaCursando) {
    carrera = new Carrera(carreraNombre, duracionCarrera, estaCursando);
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.esEstudiante = esEstudiante;
  }

  // Sobrecarga de constructores
  public Persona(String nombre, String apellido, int edad, boolean esEstudiante, String carreraNombre) {
    carrera = new Carrera(carreraNombre);
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.esEstudiante = esEstudiante;
  }

  // Métodos o comportamientos de un objeto
  public String getNombreCompleto() {
    return nombre + " " + apellido;
  }

  public String getSaludar(String saludo) {
    return "Hola, ¿cómo estas? " + saludo + "?";
  }

}
