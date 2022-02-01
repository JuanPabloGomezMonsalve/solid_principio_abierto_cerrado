package abiertocerrado;

public class Rectangulo implements Forma {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }
}
