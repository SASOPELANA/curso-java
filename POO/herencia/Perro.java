public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // overrride para sobrescribir un metodo de la clase hererada
    @Override
    public String hacerSonidos() {
        return "El perro hace Guau!!!!";
    }

}
