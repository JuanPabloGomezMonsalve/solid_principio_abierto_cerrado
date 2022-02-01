package abiertocerrado;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCirculo() {
        return Math.PI * Math.pow(radio, 2);
    }
}
