package figuras;

public class Circulo implements resultados {  // Agregar `public`
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void imprime() {
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}
