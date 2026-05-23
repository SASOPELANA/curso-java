public abstract class Figura {

    // Este comportamiento sera obligatorio para todas las clases que hereden de
    // Figura
    abstract double calcularArea();

    void imprimirInformacion() {
        System.out.println("Esta inforamacion viene de la clase Abstracta Figura");
    }

}