package figuras;

public class Triangulo extends propiedades implements resultados {
    private double altura;
    private double lado2; // Nuevo atributo para calcular perímetro correctamente

    public Triangulo(double base, double altura, double lado2) {
        this.lado = base;
        this.altura = altura;
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return lado;
    }

    public void setBase(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public Double area() {
        return (lado * altura) / 2;
    }

    @Override
    public Double perimetro() {
        return lado + (2 * lado2); // Se asume que es un triángulo isósceles
    }

    @Override
    public void imprime() {
        System.out.println("Perímetro: " + perimetro());
        System.out.println("Área: " + area());
    }
}
