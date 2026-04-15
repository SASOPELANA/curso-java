public class Persona {

    // Atributos o campos de la clase
    String nombre;
    String apellido;
    int edad;
    String[] tecnologias;
    boolean esEstudiante;
    Carrera carrera;

    // Métodos o comportamientos de un objeto
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String setSaludar(String saludo) {
        return "Hola, ¿cómo estas? " + saludo + "?";
    }

}
