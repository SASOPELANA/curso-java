public class Personas {

    // atributos o campos de la clase
    private String nombre;
    private String apellido;
    private int edad;

    // constructor
    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos
    public String getNombreCompleto() {
        return apellido + " " + nombre;
    }

    public String enviarSaludo(String saludar) {
        return "Hola, ¿Cómo estas " + saludar + "?";
    }

    // get and set

    // get edad
    public int getEdad() {
        return this.edad;
    }

    // get nombre
    public String getNombre() {
        return this.nombre.toUpperCase();
    }

    // get apelliddo
    public String getApellido() {
        return this.apellido.toUpperCase();
    }

    // set edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // set nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // set apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}