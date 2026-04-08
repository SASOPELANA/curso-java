public class Condicionales {
    public static void main(String[] args) throws Exception {
        System.out.println(" \n----- Condicionales -----\n");

        System.out.println("----- IF -----\n");

        int edad = 61;

        if (edad > 18 && edad <= 60) {
            System.out.println("Puedes entrar a la disco.");
        } else if (edad > 60) {
            System.out.println("No puedes entrar a la disco. Usted es mayor de 60 años.");
        } else if (edad == 18) {
            System.out.println("Tienes la edad justa para ingresar, no te olvides tu DNI.");
        } else {
            System.out.println("No tienes edad para entrar a la disco.");
        }

        System.out.println("\n ----- SWITCH -----\n");

        String bebida = "Gaseosa";

        funcionBebidas(bebida);

    }

    // funcion
    public static void funcionBebidas(String bedidas) {
        switch (bedidas) {
            case "Mate":
                System.out.println("Disfruta de un buen mate con tortillas.");
                break;

            case "Café":
                System.out.println("Disfruta de un buen Café en tu trabajo.");
                break;

            case "Gaseosa":
                System.out.println("!Cuidado con el azucar! es malo para la salud.");
                break;

            case "Agua":
                System.out.println("Disfruta de agua para entrenar y estar mas saludable.");
                break;

            case "Vino":
                System.out.println("Disfruta de un vaso de vino luego del almuerzo.");
                break;

            default:
                System.out.println("Disfruta tu bebída!!");
                break;
        }
    }

}
