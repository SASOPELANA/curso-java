public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Bestia", 4);

        Gato gato = new Gato("Mini Pantera", 3);

        Perro perro = new Perro("Firulais", 2);

        System.out.println("El animal llamado " + animal.nombre + " hace: ");
        System.out.println(animal.hacerSonidos());

        System.out.println("El gato llamado " + gato.nombre + " hace: ");
        System.out.println(gato.hacerSonidos());

        System.out.println("El perro llamado " + perro.nombre + " hace: ");
        System.out.println(perro.hacerSonidos());

        System.out.println("\nCantidad de animales creados: " + Animal.getContadorAnimales());

        System.out.println("\nEl nombre de la veterinaria es: " + Veterinaria.nombre);

    }
}