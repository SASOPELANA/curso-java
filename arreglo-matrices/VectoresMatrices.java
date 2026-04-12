public class VectoresMatrices {

    public static void main(String[] args) throws Exception {

        System.out.println("\n    ----- Arreglos - Matrices ----- \n");

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 33;
        numeros[3] = 41;
        numeros[4] = 52;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(" ");

        String[] hello = { "H", "o", "l", "a", " ", "M", "u", "n", "d", "o" };
        for (int i = 0; i < hello.length; i++) {
            System.out.print(hello[i]);
        }
        System.out.println("\n");

        // For-each correcto — usá la variable que te da el for
        for (String string : hello) {
            System.out.print(string);

        }
        System.out.println("\n");

        // length() --> sirve para string
        String parrafo = "Esto es una parrafo.";
        System.out.println(parrafo.length()); // --> length() -> para string

    }
}