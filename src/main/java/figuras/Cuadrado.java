
package figuras;

public class Cuadrado extends propiedades implements resultados {

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double perimetro() {
        return lado * 4;
    }

    @Override
    public Double area() {
        return lado * lado;
    }

    @Override
    public void imprime() {
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}
