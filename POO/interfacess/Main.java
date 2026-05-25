public class Main {
    public static void main(String[] args) {
        System.out.println("\n ----- INTERFACES ----- \n");

        Delfin delfin = new Delfin("Adolfino");
        Pulpo pulpo = new Pulpo("Luna", 8);

        System.out.println("\n Delfin \n");

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        System.out.println("\n Pulpo \n");

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();

    }
}