public class Animal {

    // propiedades o campos de clase
    String nombre;
    int cantPatas;
    int edad;

    // static
    static int contadorAnimales = 0;

    // constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    // metodos
    public String hacerSonidos() {
        return "Hacer sonido generico.";
    }

    public static int getContadorAnimales() {
        return contadorAnimales;
    }

}
