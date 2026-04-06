public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println(" \n----- Operadores -----\n");

        int a = 5;
        int b = 5;
        int c = a + b;

        System.out.println(c);

        int x = 13;
        int isPar = x % 2;

        if (isPar == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar.");
        }

        boolean esMayor = a > b;
        boolean esMenor = c < x;
        boolean esIgual = a == b;

        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);

        System.out.println(" ");
        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resAND = condicion1 && condicion2;
        boolean resOR = condicion1 || condicion2;
        boolean resNOT = !condicion2;

        System.out.println(resAND);
        System.out.println(resOR);
        System.out.println(resNOT);

    }
}
