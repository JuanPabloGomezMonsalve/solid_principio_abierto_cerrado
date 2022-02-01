package abiertocerrado;

public class Principal {
    public static void main(String[] args) {
        double ancho = 20;
        double largo = 50;
        double radio = 3;
        double precioMaterial = 2;

        Rectangulo rectangulo = new Rectangulo(ancho, largo);
        Circulo circulo = new Circulo(radio);

        Espejo espejoRectangular = Espejo.crearEspejoRectangular(rectangulo, precioMaterial);
        Espejo espejoRedondo = Espejo.crearEspejoRedondo(circulo, precioMaterial);

        System.out.println(espejoRectangular.calcularPrecio());

        System.out.println(espejoRedondo.calcularPrecio());

    }
}
