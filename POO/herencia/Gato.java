// herencia en gato
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        // con la palabra super estamos asignando la informacion de herencia
        super(nombre, edad);
    }

    // overrride para sobrescribir un metodo de la clase hererada
    @Override
    public String hacerSonidos() {
        return "El gato hace Miau!!!!";
    }

}
