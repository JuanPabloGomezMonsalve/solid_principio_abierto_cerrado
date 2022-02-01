package abiertocerrado;

public class Espejo {

    private double precioMaterial;
    private TipoDeEspejo tipo;
    private Rectangulo rectangulo;
    private Circulo circulo;

    private Espejo(TipoDeEspejo tipo, Rectangulo rectangulo, Circulo circulo, double precioMaterial) {
        this.tipo = tipo;
        this.rectangulo = rectangulo;
        this.circulo = circulo;
        this.precioMaterial = precioMaterial;
    }

    public static Espejo crearEspejoRedondo(Circulo circulo, double precioMaterial) {
        return new Espejo(TipoDeEspejo.REDONDO, null, circulo, precioMaterial);
    }

    public static Espejo crearEspejoRectangular(Rectangulo rectangulo, double precioMaterial) {
        return new Espejo(TipoDeEspejo.RECTANGULAR, rectangulo, null, precioMaterial);
    }

    public double calcularPrecio() {
        double area = 0.0;

        switch (tipo) {
            case REDONDO:
                area = circulo.calcularAreaCirculo();
                break;
            case RECTANGULAR:
                area = rectangulo.calcularAreaRectangulo();
                break;
        }

        return area * precioMaterial;
    }


}
