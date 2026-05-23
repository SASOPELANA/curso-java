public class Animal {

    // propiedades o campos de clase
    String nombre;
    int cantPatas;
    int edad;

    // constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodos
    public String hacerSonidos() {
        return "Hacer sonido generico.";
    }

}
