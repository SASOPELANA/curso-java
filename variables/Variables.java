public class Variables {
  public static void main(String[] args) throws Exception {
    System.out.println("\n ------ Variables en Java ------ \n");

    System.out.println(" ------ Variables Primitivas en Java ------ \n");

    System.out.println(" ------ Números ------ \n");

    int numero = 10;
    double decimal = 5.12360;
    float flotante = 3.14f;
    byte pequeño = 100;
    short mediano = 30000;
    long grande = 9000000000L; // L obligatorio

    System.out.println("Número entero: " + numero);
    System.out.println("Número decimal: " + decimal);
    System.out.println("Número flotante: " + flotante);
    System.out.println("Byte: " + pequeño);
    System.out.println("Short: " + mediano);
    System.out.println("Long: " + grande);

    System.out.println("\n ------ Caracteres ------ \n");

    char letra = 's';

    System.out.println("Caracteres en Java: " + letra);

    System.out.println("\n ------ Booleano ------ \n");

    boolean v = true;
    boolean f = false;

    System.out.println("Booleanos en Java: " + v);
    System.out.println("Booleanos en Java: " + f);

    System.out.println("\n ------ Cadena de texto en Java --> Objeto ------ \n");
    System.out.println(" ------ String -> Dato no Primitivo ------ \n");

    String cadena = "Hola desde Java, eres Prota.";

    System.out.println(cadena);

    System.out.println("\n");

    String text = "Este es un texto asignado a una variable String.";

    System.out.println(text);

    int longitud = text.length();
    System.out.println(longitud);

    char caracter = text.charAt(13);

    System.out.println(caracter);

    String subString = text.substring(3, 14);

    System.out.println(subString);

    String miniscula = text.toLowerCase();
    System.out.println(miniscula);

    String mayuscula = text.toUpperCase();
    System.out.println(mayuscula);

    int indice = text.indexOf("variable");
    System.out.println(indice);

    String reemplazo = text.replace("texto", "parrafo");
    System.out.println(reemplazo);

  }
}
