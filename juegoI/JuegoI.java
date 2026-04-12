import java.util.Scanner;

public class JuegoI {
    public static void main(String[] args) throws Exception {
        System.out.println("\n ----- JUEGO DEL AHORCADO ----- \n");

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // vectores
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // bucle for
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }
        System.out.println(" ");

        // bucle while
        while (!palabraAdivinada && intentos < intentosMaximos) {

            System.out.println("\nPalabra a adivinar: " + String.valueOf(letrasAdivinadas) + " ("
                    + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor: ");

            // usamos scanner para pedir una letra
            // convertir mayusculas a minisculas --> Character.toLowerCase()
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean yaIngresada = false;
            for (char c : letrasAdivinadas) {
                if (c == letra) {
                    yaIngresada = true;
                    break;
                }
            }
            if (yaIngresada) {
                System.out.println("Ya ingresaste esa letra, intenta con otra.");
                continue; // vuelve al inicio del while sin gastar intento
            }

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // if --> condicion
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("\n¡Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if (!palabraAdivinada) {
            System.out.println("\n¡Te has quedado sin intentos! GAME OVER");
        }

        // cerrar scanner
        scanner.close();
    }
}
