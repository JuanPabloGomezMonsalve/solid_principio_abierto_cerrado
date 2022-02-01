package abiertocerrado;

public class Espejo {

    private double precioMaterial;
    Forma forma;

    public Espejo(Forma forma, double precioMaterial) {
        this.forma = forma;
        this.precioMaterial = precioMaterial;
    }

    public double calcularPrecio() {
        return forma.calcularArea() * precioMaterial;
    }
}
