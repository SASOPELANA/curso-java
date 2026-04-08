public class Bucles {
    public static void main(String[] args) throws Exception {
        System.out.println("\n ----- Bucles en Java ----- \n");

        // cicloFor();

        // cicloWhile();

        cicloDoWhile();

    }

    public static void cicloFor() {
        System.out.println("----- CICLO FOR ----- \n");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public static void cicloWhile() {
        System.out.println("----- CICLO WHILE ----- \n");

        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i++;
        }

    }

    public static void cicloDoWhile() {
        System.out.println("----- CICLO DO WHILE ----- \n");

        // se inicia una vez si o si
        int i = 0;
        do {
            System.out.println(i + 1);
            i++;
        } while (i < 10);

    }
}
