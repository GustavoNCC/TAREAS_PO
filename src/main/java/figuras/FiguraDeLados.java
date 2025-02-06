package figuras;

public class FiguraDeLados extends propiedades implements resultados {  // Agregar `public`
    private int numeroLados;

    public FiguraDeLados(int numeroLados, double lado) {
        this.numeroLados = numeroLados;
        this.lado = lado;
    }

    @Override
    public Double area() {
        double apotema = lado / (2 * Math.tan(Math.PI / numeroLados));
        return (perimetro() * apotema) / 2;
    }

    @Override
    public Double perimetro() {
        return numeroLados * lado;
    }

    @Override
    public void imprime() {
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}
