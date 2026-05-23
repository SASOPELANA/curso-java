public abstract class ClaseAbstracta {

    public static void main(String[] args) {

        System.out.println("\nEsta es la clase abstracta\n");

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

    }
}