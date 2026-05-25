package interfaces;

// Atributos 

// No se puede tener atrubutos private, protected o public, solo se pueden tener atributos publicos, pero se recomienda no poner el modificador de acceso
// No se pueden tener constructores, ni metodos con codigo, solo se pueden tener metodos abstractos, es decir, sin codigo, solo la firma del metodo, y se deben implementar

public interface Comunicacion {

    final String SONIDO = "Sonido de comunicacion entre criaturas marinas"; // atributo constante, no se puede
                                                                            // modificar, es public por defecto

    void comunicarse();

}
