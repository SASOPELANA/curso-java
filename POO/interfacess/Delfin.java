import interfaces.Alimentable;
import interfaces.Comunicacion;

public class Delfin extends CriaturasMarinas implements Comunicacion, Alimentable {

    // constructor de la clase Delfin, que llama al constructor de la clase padre
    // CriaturasMarinas
    // super(nombre) llama al constructor de la clase padre y le pasa el nombre del
    // delfin
    public Delfin(String nombre) {
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando en velocidad con su cola y salta en el agua");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos y chasqidos para comunicarse.");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer a " + nombre);
    }

}
