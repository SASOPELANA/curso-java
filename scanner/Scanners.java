import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) throws Exception {
        System.out.println(" \n----- SCANNER -----\n");

        System.out.println("----- BIENVENIDOS A LA MAQUINA EXPENDEDORA DE BEBIDAS -----\n");

        System.out.println("Elegí una opcion de las siguientes: ");
        System.out.println("1 - Mate\n" + "2 - Café\n" + "3 - Gaseosa\n" + "4 - Agua\n" + "5 - Vino\n");

        Scanner scanner = new Scanner(System.in);

        int opcion = scanner.nextInt();

        funcionBebidas(opcion);

        if (opcion <= 5 && opcion > 0) {
            System.out.println("\n!Disfruta de tu bebida¡");
        }

        scanner.close(); // cerramos la clase scanner

    }

    // funcion
    public static void funcionBebidas(int opcion) {
        System.out.println(" ");
        switch (opcion) {
            case 1:
                System.out.println("Disfruta de un buen mate con tortillas.");
                break;

            case 2:
                System.out.println("Disfruta de un buen Café en tu trabajo.");
                break;

            case 3:
                System.out.println("!Cuidado con el azucar! es malo para la salud.");
                break;

            case 4:
                System.out.println("Disfruta de agua para entrenar y estar mas saludable.");
                break;

            case 5:
                System.out.println("Disfruta de un vaso de vino luego del almuerzo.");
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

}
