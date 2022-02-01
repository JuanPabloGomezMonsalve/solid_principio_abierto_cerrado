package abiertocerrado;

public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularAreaRectangulo() {

        return alto * ancho;
    }
}
