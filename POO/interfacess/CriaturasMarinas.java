// clase abstracta, no se puede instanciar, solo se puede heredar
public abstract class CriaturasMarinas {

    // atributos o campos de la clase
    String nombre;

    // constructor de la clase
    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    // Esto obliga a sobre escribir en las clases de hereden de criaturas marinas
    abstract void nadar();

}
