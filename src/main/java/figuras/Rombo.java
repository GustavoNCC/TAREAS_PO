package figuras;

public class Rombo extends propiedades implements resultados {  // Agregar `public`
    private double diagonalMenor;
    private double diagonalMayor;

    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public Double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public Double perimetro() {
        return 4 * lado;
    }

    @Override
    public void imprime() {
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}
