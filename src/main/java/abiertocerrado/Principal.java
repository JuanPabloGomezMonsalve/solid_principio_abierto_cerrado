package abiertocerrado;

public class Principal {
    public static void main(String[] args) {
        double ancho = 20;
        double largo = 50;
        double radio = 3;
        double precioMaterial = 2;
        double base = 5;
        double altura = 8;

        Forma rectangulo = new Rectangulo(ancho, largo);
        Forma circulo = new Circulo(radio);
        Forma triangulo = new Triangulo(base, altura);

        Espejo espejoRectangular = new Espejo(rectangulo, precioMaterial);
        Espejo espejoRedondo = new Espejo(circulo, precioMaterial);

        System.out.println(espejoRectangular.calcularPrecio());

        System.out.println(espejoRedondo.calcularPrecio());

        Espejo espejoTriangular = new Espejo(triangulo, precioMaterial);

        System.out.println(espejoTriangular.calcularPrecio());

    }
}
